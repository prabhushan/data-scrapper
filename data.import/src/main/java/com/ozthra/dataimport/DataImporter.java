package com.ozthra.dataimport;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * Hello world!
 *
 */
public class DataImporter {

	private static final String FOLDER_PATH = "D:\\cleanup\\data-import\\";
	private static final String PRACTO = "PRACTO-";
	private static final Logger log = Logger.getLogger("DataImporter");
	private String basePath;
	private String practoPath;
	private int iPath;
	private String speciality;

	public DataImporter(String speciality, String basePath, String practoPath, int iPath) throws Exception {
		this.basePath = basePath;
		this.practoPath = practoPath;
		this.iPath = iPath;
		this.speciality = speciality;
	}

	public void loadData() throws Exception {
		List<String> listResponse = new ArrayList<String>();

		for (int j = 1; j < iPath; j++) {

			String dentistPath = URLEncoder.encode(new StringBuilder(practoPath).append(j).toString(), "UTF-8");
			listResponse.add(getResults(new StringBuilder(basePath).append(dentistPath).toString(),
					new StringBuilder(PRACTO).append(speciality).append(j).append(".txt").toString()));
			log.info("Completed -" + j);
		}
		try(PersistData persistData = new PersistData()){
			persistData.insertData(listResponse,"data");

		}
	}

	private String getResults(String url, String name) throws ClientProtocolException, IOException {

		HttpGet httpPost = new HttpGet(url);
		HttpClientBuilder httpBuilder = HttpClientBuilder.create();
		try (CloseableHttpClient httpsClient = httpBuilder.build();
				CloseableHttpResponse response = httpsClient.execute(httpPost);) {
			String responseData = EntityUtils.toString(response.getEntity());
			FileUtils.writeStringToFile(new File(FOLDER_PATH + name), responseData);
			return responseData;

		}

	}

}

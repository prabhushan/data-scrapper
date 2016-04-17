package com.ozthra.dataimport;

import java.io.File;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	private static final String BASE_PATH = "https://extraction.import.io/query/runtime/e755c60d-9575-4baa-8ba5-0a41e36e1b67?_apikey=f093e21cd4b64096897304f1c1052f11310abe69637147"
			+ "75c8a479cd3c78fb1d651aa25c9a17ff12fa09f790ffccea6f2180d15b388ed1e06ccf9e7743241020c6c3b8c65955a3d9a670ef8fae4dd732&url=";
    private static final String DENTIST_PATH ="https://www.practo.com/chennai/dentist?page=";
    private static final String OBG="https://www.practo.com/chennai/gynecologist-obstetrician?page=";
	public static void main(String[] args) throws Exception {
		//DataImporter dataImporter = new DataImporter("Dentist",BASE_PATH, DENTIST_PATH, 51);
		Gson gson = new GsonBuilder().create();
		Data data = gson.fromJson(FileUtils.readFileToString(new File(("data.json"))), Data.class);
		for (PracticeInfo practiceInfo : data.getPracticeInfo()) {
			DataImporter dataImporter = new DataImporter(practiceInfo.getSpeciality(),BASE_PATH, practiceInfo.getUrl(), practiceInfo.getPage());
			dataImporter.loadData();
		}
	}

}

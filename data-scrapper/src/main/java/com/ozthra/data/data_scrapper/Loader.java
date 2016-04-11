package com.ozthra.data.data_scrapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class Loader {
	public static void main(String[] args) throws MalformedURLException, IOException {
		// Document doc = Jsoup.parse(new
		// URL("https://www.practo.com/chennai/dentist?page=1"), 10000);
		Document doc = Jsoup.connect("https://www.practo.com/chennai/dentist?page=1")
				.userAgent(
						"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36")
				.get();

		Elements detailsElement = doc.select("div.listing-row");
		for (Element element : detailsElement) {
			//URL + IMAGE
			for (Element element1 : element.select("div.doc-photo-container span")) {
				System.out.println(element1.attr("href"));
				System.out.println(element1.select("img").get(0).attr("data-lazy-src"));
			}
			//NAME
			Elements detailElement = element.select("div.doc-details-block a h2");
			for (Element elementDetails : detailElement) {
				System.out.println(elementDetails.text());

			}
			//Qualification
			Elements qualificationEle = element.select("div.doc-details-block p.doc-qualifications");
			for (Element elementDetails : qualificationEle) {
				System.out.println(elementDetails.text());

			}
			
			//Experience
			Elements expEle = element.select("div.doc-details-block p.doc-exp-years");
			for (Element elementDetails : expEle) {
				System.out.println(elementDetails.text());

			}
			
			//specialties
			Elements specEle = element.select("div.doc-details-block p.doc-specialties");
			for (Element elementDetails : specEle) {
				System.out.println(elementDetails.text());

			}
			
			
			System.out.println("#######################3");
		}

	/*	Elements photoElement = doc.select("div.listing-row div.doc-photo-container span");

		
		for (Element element : photoElement) { // URL
			System.out.println(element.attr("href"));
			System.out.println(element.select("img").get(0).attr("data-lazy-src"));
		}*/
		 

		
	/*	Elements detailsElement = doc.select("div.listing-row div.doc-details-block a h2");
		for (Element element : detailsElement) {
			System.out.println(element.text());

		}*/
		 

		/*Elements detailsElement = doc.select("div.listing-row div.doc-details-block a h2");
		for (Element element : detailsElement) {
			System.out.println(element.text());

		}
*/
	}
}

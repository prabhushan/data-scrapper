package com.ozthra.dataimport;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;

public class PersistData implements AutoCloseable{

	static MongoClient mongo = new MongoClient("localhost", 27017);

	public void insertData(List<String> listData) {
		List<Document> listDocs = new ArrayList<>();
		for (String data : listData) {
			listDocs.add(Document.parse(data));
		}
		mongo.getDatabase("data").getCollection("data").insertMany(listDocs);
	}
	
	public void close(){
		mongo.close();
	}

}

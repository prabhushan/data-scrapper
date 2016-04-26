package com.ozthra.dataimport;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;

public class PersistData implements AutoCloseable{

	static MongoClient mongo = new MongoClient("localhost", 27017);
	private static final String DATABASE = "data";
	public void insertData(List<String> listData,String table) {
		List<Document> listDocs = new ArrayList<>();
		for (String data : listData) {
			listDocs.add(Document.parse(data));
		}
		mongo.getDatabase(DATABASE).getCollection(table).insertMany(listDocs);
	}
	
	public List<String> fetchData(String table){
		FindIterable<Document> listDocuments = mongo.getDatabase(DATABASE).getCollection(table).find();
		List<String> listResponse = new ArrayList<>();
		for (Document document : listDocuments) {
			listResponse.add(document.toJson());
		}
		return listResponse;
	}
	
	public void close(){
		mongo.close();
	}

}

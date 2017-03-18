package com.zjy.jms.adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.bson.Document;
import org.springframework.stereotype.Component;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;

@Component
public class ConsumerAdapter {
	private static Logger logger = (Logger) LogManager.getLogger(ConsumerAdapter.class.getName());
	public void sendToMongo(String json) {
		logger.info("Sending to MongoDB");
		MongoClient client = new MongoClient();
		
		//MongoDatabase database =client.getDatabase("vendor");
		//MongoCollection<Document> collection = database.getCollection("contact");
		DB db = client.getDB("vendor");
		DBCollection collection = db.getCollection("contact");
		
		logger.info("Converting JSON to DBObject");
		
		//Document document = Document.parse(json);
		//collection.insertOne(document);	
		DBObject object = (DBObject)JSON.parse(json);
		collection.insert(object);
		
		logger.info("Sent to MongoDB");
		client.close();
	}

}

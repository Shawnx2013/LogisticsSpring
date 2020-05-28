package com.log.LogisticsSpring.Util;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class MongoDBUtil {
    public MongoClient MongoDBConnect() {
        return new MongoClient("localhost", 27017);
    }

    public FindIterable<Document> findLogin(MongoClient mongo, String dbname, String collectionName, String username, String password){
        MongoDatabase db = mongo.getDatabase(dbname);
        MongoCollection<Document> collection = db.getCollection(collectionName);
        BasicDBObject query = new BasicDBObject();
        query.append("username",username).append("password",password);
        return collection.find(query);
    }
    public void insertLogin(MongoClient mongo, String dbname, String collectionName, String username, String password){
        MongoDatabase db = mongo.getDatabase(dbname);
        MongoCollection<Document> collection = db.getCollection(collectionName);
        Document document = new Document("username", username).append("password", password);
        collection.insertOne(document);
    }
}

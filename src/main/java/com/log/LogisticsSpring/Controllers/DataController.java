package com.log.LogisticsSpring.Controllers;

import com.log.LogisticsSpring.Util.MongoDBUtil;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class DataController {
    @Autowired
    MongoDBUtil mongoDBUtil;

    @RequestMapping("/testDB")
    public List<Document> testDB(){
        List<Document> result = new ArrayList<>();
        try{
            MongoClient mongo = mongoDBUtil.MongoDBConnect();
            FindIterable<Document> iterDocuments =  mongoDBUtil.findLogin(mongo,"ReBook","login","ee","ee");
            iterDocuments.iterator().forEachRemaining(result::add);
        } catch (Exception e) {
             e.printStackTrace();
        }
        return result;
    }
}

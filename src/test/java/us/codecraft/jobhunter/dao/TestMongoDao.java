package us.codecraft.jobhunter.dao;

import com.mongodb.*;
import org.junit.Test;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Set;

/**
 * User: cairne
 * Date: 13-4-20
 * Time: 下午5:26
 */
public class TestMongoDao {

    @Test
    public void test() throws UnknownHostException {
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
// or, to connect to a replica set, supply a seed list of members
        DB db = mongoClient.getDB( "test" );
        Set<String> colls = db.getCollectionNames();

        for (String s : colls) {
            System.out.println(s);
        }
        DBCollection coll = db.getCollection("mycoll");
        BasicDBObject doc = new BasicDBObject("name", "MongoDB").
                append("type", "测试").
                append("count", 1).
                append("info", new BasicDBObject("x", 203).append("y", 102));

        coll.insert(doc);
    }
}

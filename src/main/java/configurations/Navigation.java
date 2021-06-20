package configurations;

import com.mongodb.MongoClient;

public class Navigation {
	public MongoClient conn;
	
	public Navigation(MongoClient conn) {
		this.conn = conn;
	}
}

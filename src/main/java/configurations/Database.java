package configurations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;


public class Database extends Navigation {
	public static MongoClient conn;
	// *********Constructor*********
    
	// Constructor	
	public Database(MongoClient conn) {
		Database.conn = conn;
	}
	// *********DB Variables*********
	// Database That will be used
	@SuppressWarnings("unused")
	private MongoDatabase db = SetUpConnection().getDatabase("api-test");
	// Object of Statement. It is used to create a Statement to execute the query
	public Statement stmt;
	public Statement stmtId;
	// Object of ResultSet => 'It maintains a cursor that points to the current row
	// in the result set'
	public ResultSet dbOut;
	public ResultSet relIdList;

	// *********Connector*********
	/**
	 * Method used to setup a connection with database. Activated by TestNG
	 * automatically before every test.
	 * 
	 * @param db Target Database.
	 * @return Connection Enabling use of the queries.
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public MongoClient SetUpConnection() {
		// Register MongoClient (JDBC driver name and Database URL)
		return conn = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
	}

	// *********Methods*********


	/**
	 * Terminates all Database connections that where left open in case of
	 * unexpected issues.
	 */
	public void CloseTheConnection() throws SQLException {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
			}
		}
		if (stmtId != null) {
			try {
				stmtId.close();
			} catch (Exception e) {
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}

}

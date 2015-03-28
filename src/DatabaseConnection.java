import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
	private static final String userName="root";
	private static final String userPass="user";
	private static final String hCon="jdbc:hsqldb:data/explorecalifornia";
	private static final String MCon="jdbc:mysql://localhost:3306/classicmodels";
	
	
	
	public static Connection getConnection(DbName dbName) throws SQLException 
	{
		switch(dbName){
		case hSqlDb:
			
			return DriverManager.getConnection(hCon, userName, userPass);
		case mySqlDb:
		
			return DriverManager.getConnection(MCon, userName, userPass);
		default:
			return null;
		}
		
	}

}

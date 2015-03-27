import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection
{
	private static final String userName="tarek";
	private static final String userPass="tarekahsan";
	private static final String hCon="jdbc:hsqldb:data/explorecalifornia";
	private static final String MCon="jdbc:mysql://localhost/explorecalifornia";
	
	
	
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

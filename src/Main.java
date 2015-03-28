import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Main
{		

	public static void main(String[] args) throws SQLException
	{ 


		try(Connection con=DatabaseConnection.getConnection(DbName.mySqlDb);
				Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				ResultSet resultSet=stm.executeQuery("SELECT * FROM customers");)
		{
			 while(resultSet.next())
			 {
				 StringBuffer bf=new StringBuffer();
				 bf.append("the data is "+resultSet.getInt("customerNumber"));
				 System.out.println(bf.toString());
				 
			 }

		} catch (SQLException e) 
		{
		       System.out.println("Here is the error"+e);
		}




	}

} 

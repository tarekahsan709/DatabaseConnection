import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Main
{		

	public static void main(String[] args) throws SQLException
	{ 


		try(Connection con=DatabaseConnection.getConnection(DbName.hSqlDb);
				Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				ResultSet resultSet=stm.executeQuery("SELECT * FROM STATES");
				)
				{
			        System.out.println("Our current row number is "+resultSet.getRow());

				} catch (SQLException e) 
				{
					System.out.println("Here is the error"+e);
				}




	}

} 

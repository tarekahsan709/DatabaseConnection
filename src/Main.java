import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Main
{		
	
	public static void main(String[] args) throws SQLException
	{ 
		Connection con=null;
		Statement stm=null;
		ResultSet resultSet=null;
		
		try
		{
			con=DatabaseConnection.getConnection(DbName.hSqlDb);
			System.out.println("Connection successfull");
			stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			resultSet=stm.executeQuery("SELECT * FROM STATES");
			resultSet.last();
			System.out.println("Our current row number is "+resultSet.getRow());
			
		} catch (SQLException e) 
		{
			System.out.println("Here is the error"+e);
		}finally
		{
			if(resultSet!=null)
			{
				resultSet.close();
			}
			if(stm!=null)
			{
				stm.close();
			}
			if(con!=null)
			{
				con.close();
			}
			
		}
	
	
		

	}

} 

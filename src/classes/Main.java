

package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;




/**
 * @author Parsa
 *
 */
public class Main {

	   
	 
	public static Connection makeconnection()
	  {
		  
		 //connection to the Library database
		  try
		  {
			String libURL = "jdbc:derby:Library;create=true"; // connects to Library table and creates if does not exist
			 Connection con =  DriverManager.getConnection(libURL);
			System.out.println("Connected/Created Library Database");
			return con;
		  }
		  catch ( SQLException err ) 
	        {
	            System.out.println( err.getMessage( ) );
	            return null;
	        } 
	  }
	  
	
	public static void listUsers(Connection con) throws SQLException // this is a example function it prints ID of all users (use as reference)
	{
		System.out.println("Creating statement...");
	    Statement stmt = con.createStatement(); //linking statement to db
	      String sql = "SELECT * FROM Users"; // query we want to parse
	      ResultSet rs = stmt.executeQuery(sql); //executes query using statement member and output goes to ResultSet (which is a object of a table of data)
	      //extract results from rs
	      while(rs.next()){
				 System.out.println(""+rs.getInt("ID"));				
			  }
	}
	
	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con; //holds connection of db
		con = makeconnection();
		listUsers(con);
		
		
		
		
		
		
		
	}
	

}

/*
 *User class is the prototype for all other users (student,librarian,admin)
 * User is able to connect to the User database 
 * 
 * CREATE TABLE Users (
 *  ID INTEGER PRIMARY KEY NOT NULL ,
 *  first_name VARCHAR(255),
 *  last_name VARCHAR(255),
 *  address VARCHAR(255),
 *  phone_num INTEGER);
 *  parent class for all users
 * ID will determine what kind of user is accessing the library
 * if Id starts with 0 then it is a student
 * if ID starts with 1 then it is a Librarian
 * if ID starts with 2 then it is an admin
 */


package classes;
import java.sql.Connection; // for connection
import java.sql.DriverManager; // for connection
import java.sql.SQLException; // for error handling
import java.sql.Statement; //used to write sql statements in java



	public  class User 
	{
		//idk if these are still necessary if we have a database
	  protected int id;
	  protected String first_name;
	  protected String last_name;
	  protected String address;
	  protected int phone_num;

	// public void login(int id) {will take an int and compare it to ID in database }
	  
	  
	  //this function can probably be moved somewhere else
	  public Connection makeconnection()
	  {
		 
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
	  
	}


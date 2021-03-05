/*
 * LIBRARY DATABASE CONTAINS
 *  {bookID INTEGER PRIMARY KEY NOT NULL ,   
 * title VARCHAR(255),	
 *  author VARCHAR(255),
 *  type VARCHAR(255), //either declare as book,video,magazine
 * isTaken BOOLEAN); }
 * 
 * Library class
 * This class will connect to the database
 */

package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Library 
{

	
	
	
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




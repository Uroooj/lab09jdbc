//STEP 1. Import required packages
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class demo {
	
	String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/toystopinventorymanagementsystem";
	String username = "root";
	String password = "root";
	
	 //function to add employee
	void addEmployee(String EmpName,int UID,String email,int storeID) throws ClassNotFoundException, SQLException
    {	 
        Class.forName("com.mysql.jdbc.Driver");

    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
	Connection myConn = DriverManager.getConnection(URL, username, password);

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
	Statement myStmt = myConn.createStatement();
    String sql;
    sql = "INSERT into EMPLOYEE VALUES('"+EmpName+"',"+UID+",'"+email+"',"+storeID+");";
    myStmt.executeUpdate(sql);
    System.out.println("Data Inserted in Employee!");
    myStmt.close();
    myConn.close();
    }
	
	//function to add Store
	 void addStore(int SID,String address,String contactNo,String email) throws ClassNotFoundException, SQLException
     { 
         Class.forName("com.mysql.jdbc.Driver");

       //STEP 3: Open a connection
        System.out.println("Connecting to database...");
     	Connection myConn = DriverManager.getConnection(URL, username, password);

         //STEP 4: Execute a query
        System.out.println("Creating statement...");
     	Statement myStmt = myConn.createStatement();
     	String sql;
     	sql = "INSERT into STORE VALUES("+SID+",'"+address+"','"+contactNo+"','"+email+"');";
     	System.out.println("Data Inserted in Store!");
     	myStmt.executeUpdate(sql);
     	myStmt.close();
     	myConn.close();
     }
	
	 void addToy(int TID,String ToyName,int price,int minAge,int maxAge, int addon) throws ClassNotFoundException, SQLException
     {   
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
  	Connection myConn = DriverManager.getConnection(URL, username, password);

      //STEP 4: Execute a query
     System.out.println("Creating statement...");
  	 Statement myStmt = myConn.createStatement();
     String sql;
     sql = "INSERT into TOY VALUES("+TID+",'"+ToyName+"',"+price+","+minAge+","+maxAge+", "+addon+");";
     myStmt.executeUpdate(sql);
     System.out.println("Data Inserted in Toy!");
     myStmt.close();
     myConn.close();
     }
	 
	
	public static void main(String[] args){
		
		demo mydemo = new demo();
		
		//insert data into store table
		try {
			mydemo.addStore(16,"bleckh","monkey","smtp");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			mydemo.addToy(2,"Doll",12,13,14,111);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			mydemo.addEmployee("Urooj",2, "Doll@foo.com",12);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
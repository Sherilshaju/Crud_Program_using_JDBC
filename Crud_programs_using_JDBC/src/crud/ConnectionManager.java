package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionManager {

	public Connection getConnection() throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);	
		// TODO Auto-generated method stub
  Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con=null;//con is an object
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");

if(con!=null)//connection checking
{
	return con;
}
else
{
	return null;
}
	}

}

package Usermanagement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Insertadmin {
	public void Admin() throws ClassNotFoundException,SQLException{
		java.sql.Connection con=null;//con is an object
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentadmin","root","");
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the UserID");
	int userid=s.nextInt();
	System.out.println("Enter the Username");
	String user=s.next();
	System.out.println("Enter the Password");
	String pass=s.next();
	PreparedStatement st=con.prepareStatement("Insert into admin(User_id,User_name,Password) values(?,?,?);");
	st.setInt(1, userid);
	st.setString(2, user);
	st.setString(3, pass);
	st.executeUpdate();
	System.out.println("Successfully Inserted");
	con.close();
	}
	
}

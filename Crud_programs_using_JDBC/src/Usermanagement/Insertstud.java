package Usermanagement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insertstud {
	Connection con=new Connection();
	public void Stud()throws ClassNotFoundException,SQLException{
		java.sql.Connection con=null;//con is an object
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentadmin","root","");
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the UserID");
		int userid=s.nextInt();
		System.out.println("Enter the Username");
		String user=s.next();
		System.out.println("Enter the Password");
		String pass=s.next();
		PreparedStatement st=con.prepareStatement("Insert into student1(User_id,User_name,Password) values(?,?,?);");
		st.setInt(1, userid);
		st.setString(2, user);
		st.setString(3, pass);
		st.executeUpdate();
		System.out.println("Successfully Inserted");	
	}

}

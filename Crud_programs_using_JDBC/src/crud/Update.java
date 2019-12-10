package crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	ConnectionManager con=new ConnectionManager();
	public void updatedata() throws SQLException,ClassNotFoundException{
		//ConnectionManager con=new ConnectionManager();
		Scanner s=new Scanner(System.in);
		Statement smt=(Statement) con.getConnection().createStatement();
		System.out.println("Enter Id:");
		int rollno=s.nextInt();
		System.out.println("Enter new Address:");
		String addr=s.next();
		
		//System.out.println("Enter new year:");
		//String year=s.next();
		//System.out.println("Enter new Department:");
		//String dep=s.next();
		PreparedStatement ps=con.getConnection().prepareStatement("update student set ADDRESS=? where REG_NO=?");
		ps.setString(1, addr);
		ps.setInt(2, rollno);
		ps.executeUpdate();
		System.out.println("Successfully Updated...");
	}

}
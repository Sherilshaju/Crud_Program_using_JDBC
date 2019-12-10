package crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
	ConnectionManager con=new ConnectionManager();
	public void deletedata()throws SQLException,ClassNotFoundException {
		
		Scanner s=new Scanner(System.in);
		Statement smt=(Statement) con.getConnection().createStatement();
		System.out.println("Enter thr REGISTER NUMBER which you want to delete:");
		int rollno=s.nextInt();
		PreparedStatement ps=con.getConnection().prepareStatement("delete from student where REG_NO=?");
		ps.setInt(1, rollno);
		ps.executeUpdate();
		System.out.println("Successfully Deleted...");
	
	}

}

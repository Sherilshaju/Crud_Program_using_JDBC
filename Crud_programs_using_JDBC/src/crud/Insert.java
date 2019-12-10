package crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
	ConnectionManager con=new ConnectionManager();
	public void insertdata()throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=s.next();
	System.out.println("Enter the Register number");
	int regno=s.nextInt();
	System.out.println("Enter the year");
	int year=s.nextInt();
	System.out.println("Enter the Department");
	String dept=s.next();
	System.out.println("Enter the Address");
	String addr=s.next();
	PreparedStatement st=(PreparedStatement)con.getConnection().prepareStatement("Insert into student(NAME,REG_NO,YEAR,DEPARTMENT,ADDRESS) values(?,?,?,?,?);");
	st.setString(1, name);
	st.setInt(2, regno);
	st.setInt(3,year);
	st.setString(4,dept);
	st.setString(5,addr);
	st.executeUpdate();
	System.out.println("Insert successfull");
}
}

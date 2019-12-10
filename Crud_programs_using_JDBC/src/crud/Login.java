package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Login {

	public void logindata() throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
		
		ConnectionManager con = new ConnectionManager();
		System.out.println("Welcome to Login");
		System.out.println("Enter the name");
		String name = s.next();
		System.out.println("Enter the Password");
		int pass = s.nextInt();
		int flag=0;
		Statement s1 = (Statement) con.getConnection().createStatement();
		ResultSet r = s1.executeQuery("select * from student");
		while(r.next())
		{
		String name1=r.getString(1);
		int pass1 = r.getInt(5);
		if(name1.contentEquals(name)&&pass1==pass)
			flag=1;
		}
		if(flag==1)
			System.out.println("Sucessfully verified");
		else
			System.out.println("Not verified");
		//CaseStudy a = new CaseStudy();
		//a.choice();
		
	}

	
	}



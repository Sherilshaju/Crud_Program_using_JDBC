package crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View {
	ConnectionManager con=new ConnectionManager();
	public void viewdata() throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Statement s1=(Statement) con.getConnection().createStatement();//for executing the sql statement  
		ResultSet r=s1.executeQuery("select * from student");//query to select the details of all students
		//bjects returned from the query by repeatedly calling Statement
		while(r.next())//iterating the values of result
		{
			System.out.println(r.getString(1)+" "+r.getInt(2)+" "+r.getInt(3)+" "+r.getString(4)+" "+r.getString(5));
		}
	
		
	}

}

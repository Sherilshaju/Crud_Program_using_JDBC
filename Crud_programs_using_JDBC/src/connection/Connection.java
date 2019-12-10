package connection;

import java.sql.*;
import java.util.Scanner;
public class Connection{
private static Connection NULL;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner s=new Scanner(System.in);	
		// TODO Auto-generated method stub
  Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con=null;//con is an object
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");

if(con!=NULL)//connection checking
{
	System.out.println("Connection successful");
}
else
{
	System.out.println("Check your Connection ");
}
System.out.println("1) Insert");
System.out.println("2) Display");
System.out.println("Enter the Operation");
int c=s.nextInt();
switch(c)
{

case 1:
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
PreparedStatement st=con.prepareStatement("Insert into student(NAME,REG_NO,YEAR,DEPARTMENT,ADDRESS) values(?,?,?,?,?);");
st.setString(1, name);
st.setInt(2, regno);
st.setInt(3,year);
st.setString(4,dept);
st.setString(5,addr);
st.executeUpdate();
System.out.println("Insert successfull");
break;
case 2:
	Statement s1=con.createStatement();//for executing the sql statement  
	ResultSet r=s1.executeQuery("select * from student");//query to select the details of all students
	//bjects returned from the query by repeatedly calling Statement
	while(r.next())//iterating the values of result
	{
		System.out.println(r.getString(1)+" "+r.getInt(2)+" "+r.getInt(3)+" "+r.getString(4)+" "+r.getString(5));
	}
	con.close();
	break;
}
con.close();//closing the connection
	}

	}

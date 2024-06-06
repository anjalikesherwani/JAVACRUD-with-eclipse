package sqlConn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDjava {

	public static void main(String[] args) throws ClassNotFoundException , SQLException {
		// Driver Register
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/UMS","root","");
//		System.out.println("connected" + conn);
		
		
//		1. <-----------Show databases--------------->
			
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost","root","");
//		Statement st = conn.createStatement();
//		ResultSet rs = st.executeQuery("show databases");
//		
//		System.out.println("databases are : " + rs);
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//			
//		}
		
		
//2. <--------------Create Databases----------------> 
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost","root","");
//		Statement st = conn.createStatement();
//		st.executeUpdate("create database UMS");
//		System.out.println("created database");
		
		
		
//3. <---------------Create Table--------------------->
//		add datadase name in conn variable
		

//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/UMS","root","");		
//		String sql = "create table CRUDums(id int,name varchar(30), mail varchar(45) primary key,age int)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.println("table created");

		
//4. <---------------insert data--------------------->
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/UMS","root","");
//		String sql = "insert into CRUDums values (101,'jyoti','jyo@123',23),(102,'Anjali','anjali@123',22),(103,'vaishu','vaishu@123',22),(104,'anaya','anaya@123',12)";
//		Statement st = conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.println("data inserted");
		
		
//5. < -----------------show data----------------------->
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/UMS","root","");
//		String sql = "select * from CRUDums";
//		Statement st = conn.createStatement(); 
//        ResultSet rs = st.executeQuery(sql);
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt("id")+"-"+rs.getString("name")+" - "+ rs.getString("mail")+"-"+rs.getInt("age"));
//			
//		}

		
//6.  <-------------------Update data------------------> 
		
//	   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/UMS","root","");
//     String updateQuery = "UPDATE CRUDums SET name = 'navi' WHERE name = 'jyoti'";
//     Statement st = conn.createStatement();
//     st.executeUpdate(updateQuery);
//     System.out.println("Data updated");
		
		
//7. <-------------------Delete data from mail ---------------------->
		
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/UMS","root","");
//	    String deleteQuery = "DELETE FROM CRUDums WHERE mail = 'jyo@123'";
//	    Statement st = conn.createStatement();
//	    st.executeUpdate(deleteQuery);
//	    System.out.println("Data deleted Successfully");
		
		
//8. <--------------- delete Table---------------------->

//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sakshi","root","");
//		System.out.println("connected" + conn);
//		String deleteQuery = "Drop Table nsti";
//		Statement st = conn.createStatement();
//		st.executeUpdate(deleteQuery);
//		System.out.println("Table deleted Successfully");
		
		
//9. <--------------- delete database---------------------->

//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sakshi","root","");
//		System.out.println("connected" + conn);
//		String deleteQuery = "Drop database sakshi";
//		Statement st = conn.createStatement();
//		st.executeUpdate(deleteQuery);
//		System.out.println("Database deleted Successfully");		

		 
		 
		 
//10. <------------------add new column---------------------->
		 
//		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/UMS","root","");
//		 String addquery ="Alter table CRUDums add column address varchar(50)" ;
//		 Statement st = conn.createStatement();
//		 st.executeUpdate(addquery);
//		 System.out.println("New column added");
	 

		 
//11. <------------------delete column----------------------->
		 
		 Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/UMS","root","");
		 String deletequery ="Alter table CRUDums drop age" ;
		 Statement st = conn.createStatement();
		 st.executeUpdate(deletequery);
		 System.out.println("Column deleted successfully");

		

	}

}

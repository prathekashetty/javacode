import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MarketTester {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/air", "root", "pratheeka@123");
		 statement=connection.createStatement();
		//statement.execute("insert into airport_details value(5,'International Gandhi Airport','Dehli',10)");
		 ResultSet set=statement.executeQuery("select * from airport_details");
		 while(set.next())
		 {
			 int id=set.getInt(1);
			 String name=set.getString(2);
			 String loaction=set.getString(3);
			 int noarilines=set.getInt(1);
			 System.out.println(id+"\t"+name+"\t"+loaction+"\t"+noarilines);
		 }
		
		}catch(ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());
			
		}finally {
			try {
				statement.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
			try {
				connection.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
			
		}

	}

}

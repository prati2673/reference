package referencedemo;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class refdemo {

		public static void main(String[] args) throws SQLException, ClassNotFoundException{
			// TODO Auto-generated method stub
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collage","root","Pratishruti@2001");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select *from Student");
			while(rs.next()) {
				int id= rs.getInt("Id");
				String name = rs.getString("Name");
				String regd= rs.getString("Regd");
				int age = rs.getInt("Age");
				String mobile = rs.getString("Mobile");
				String city = rs.getString("City");
				
				System.out.println(id+" "+name+" "+regd+" "+age+" "+mobile+" "+city);
				
			}
			st.close();
			con.close();

		}
		

	}




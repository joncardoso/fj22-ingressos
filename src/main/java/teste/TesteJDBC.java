package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteJDBC {
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.10.100/teimsoso", "root", ""
				+ ""
				+ "");
		
		System.out.println(connection);
		
		
		ResultSet rs = connection.prepareStatement("select * from contatos").executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getLong("id"));
		}
			
	}
}

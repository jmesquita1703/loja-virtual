package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
	public static void main(String[] args) throws SQLException{
		Connection connection = 
				DriverManager.getConnection("jdbc:mysql://localhost/cwd_eai_kibon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false", "root", "nielsenmanon");
		
		System.out.println("abrindo uma conexao com o banco de dados");
		
		
		
		connection.close();
	}
	
	
}

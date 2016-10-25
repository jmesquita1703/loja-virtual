package br.com.caelum.jdbc;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/cwd_eai_kibon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false",
				"root", "nielsenmanon");
		
		Statement statement = connection.createStatement();
		boolean resultado = statement.execute("select * from cwreturntemplatemessages limit 15;");
		ResultSet resultSet = statement.getResultSet();

		while (resultSet.next()) {
			long id = resultSet.getLong("id");
			System.out.println("Id: " + id);

			String VehicleNumber = resultSet.getString("VehicleNumber");
			System.out.println("Número do veículo: " + VehicleNumber);

			String Message = resultSet.getString("Message");
			System.out.println("Messagem: " + Message);
		}
		
		resultSet.close();
		statement.close();
		connection.close();

	}
}

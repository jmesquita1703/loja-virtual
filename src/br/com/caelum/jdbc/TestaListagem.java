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
				"jdbc:mysql://localhost/loja_virtual?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false",
				"root", "nielsenmanon");
		
		Statement statement = connection.createStatement();
		boolean resultado = statement.execute("select * from produto");
		ResultSet resultSet = statement.getResultSet();

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			System.out.println("Id: " + id);

			String nome = resultSet.getString("nome");
			System.out.println("Número do veículo: " + nome);

			String descricao = resultSet.getString("descricao");
			System.out.println("Messagem: " + descricao);
		}
		
		resultSet.close();
		statement.close();
		connection.close();

	}
}

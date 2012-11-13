package br.com.fiap.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static void registraDriverJdbc() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {

			ex.printStackTrace();

			System.exit(1);

		}
	}

	public static Connection getConnection() throws SQLException{
		
		String server = "localhost";
		String database = "banco_fiap";
		String usuario = "fiap";
		String senha = "fiap123";

		String url = "jdbc:mysql://" + server + "/" + database;

		registraDriverJdbc();
		return DriverManager.getConnection(url, usuario, senha);
		
	}
	
}

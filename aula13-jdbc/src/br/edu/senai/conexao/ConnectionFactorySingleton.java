package br.edu.senai.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//Singleton
public class ConnectionFactorySingleton {
	private static String urlConexao = "jdbc:postgresql://localhost:5432/aula_jdbc";
	private static String usuario = "postgres";
	private static String senha = "joaop201";
	private static Connection connection = null;

	private static Connection newConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(urlConexao, usuario, senha);
			System.out.println("Conectado com sucesso.");
		} catch (SQLException e) {
			System.out.println("Não foi possível pegar a conexão.");
		}
		return con;
	}

	public static Connection getConnection() {
		if (connection == null) {
			connection = newConnection();
		}
		return connection;
	}
}

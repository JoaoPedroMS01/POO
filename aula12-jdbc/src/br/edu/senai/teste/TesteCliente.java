package br.edu.senai.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.edu.senai.conexao.ConnectionFactory;
import br.edu.senai.model.Cliente;
import br.edu.senai.persistence.ClienteDao;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(null, "Roberta da Silva", "21262653", "rs@gmail.com");
		Cliente cliente2 = new Cliente(null, "Mariana", "48262653", "mari@gmail.com");
		
		Connection connection = new ConnectionFactory().getConnection();
		
		ClienteDao clienteDao = new ClienteDao(connection);
		
		try {
			connection.setAutoCommit(false);
			clienteDao.inserirCliente(cliente);
			clienteDao.inserirCliente(cliente2);
			connection.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//clienteDao.inserirCliente(cliente);
		//clienteDao.atualizarCliente(cliente);
		//clienteDao.removerCliente(cliente);
		
//		System.out.println(clienteDao.listarClientes());
//		for (Cliente c : clienteDao.listarClientes()) {
//			System.out.println(c);
//		}
		//CRUD (CREATE RETRIEVE UPDATE DELETE)
		//System.out.println(clienteDao.listarClientes("dri"));
	}

}

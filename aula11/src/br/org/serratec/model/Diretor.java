package br.org.serratec.model;

public class Diretor extends Funcionario {
	private String categotia;

	public Diretor(String nome, String email, Double valor, String categoria) {
		super(nome, email, valor);
		
	}

	public String getCategotia() {
		return categotia;
	}

}

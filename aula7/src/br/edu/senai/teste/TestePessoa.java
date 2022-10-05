package br.edu.senai.teste;

import br.edu.senai.enums.EstadoCivil;
import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Setor;

public class TestePessoa {

	public static void main(String[] args) {
		Setor setor1 = new Setor(456, "RH");
		Setor setor2 = new Setor(789, "DP");

		Pessoa pessoa1 = new Pessoa("João", "63729374", EstadoCivil.SOLTEIRO, setor1);
		Pessoa pessoa2 = new Pessoa("Paulo", "63729839", EstadoCivil.CASADO, setor2);

		System.out.println("Dados pessoais: " + pessoa1 + "\nSetor: " + pessoa1.getSetor());
		System.out.println("\nDados pessoais: " + pessoa2 + "\nSetor: " + pessoa2.getSetor());

		for (EstadoCivil situacao : EstadoCivil.values()) {
			System.out.println("\n" + situacao);
		}
	}

}

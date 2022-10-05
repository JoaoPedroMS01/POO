package br.org.serratec.teste;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCodigo(1);
		pessoa1.setNome("Ricardo");
		pessoa1.setPeso(80.00);
		pessoa1.setAltura(1.91);

		new Pessoa();
		Pessoa pessoa2 = new Pessoa(2, "Maria", 80.1, 1.75);

		System.out.println("Condição: " + pessoa1.resultadoIMC());
		System.out.println("Condição: " + pessoa2.resultadoIMC());
	}

}

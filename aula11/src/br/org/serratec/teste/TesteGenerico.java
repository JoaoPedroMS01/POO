package br.org.serratec.teste;

import br.org.serratec.generico.MeuGenerico;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Funcionario;

public class TesteGenerico {

	public static void main(String[] args) {
		MeuGenerico<String> mg1 = new MeuGenerico<String>("Hello!");
		MeuGenerico<Integer> mg2 = new MeuGenerico<Integer>(1000);
		MeuGenerico<Funcionario> mg3 = new MeuGenerico<Funcionario>(new Funcionario("João", "jp@gmail.com", 20000.));
		
		//Qualquer coisa que tenha como super a classe Funcionario.
		MeuGenerico<? super Funcionario> mg4 = new MeuGenerico<Funcionario>(
				new Diretor("Marcos", "m@gmail.com", 9000., "CIO"));
		
		System.out.println(mg4);
	}

}

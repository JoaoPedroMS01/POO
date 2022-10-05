package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Gerente;

public class TesteEmpregado {

	public static void main(String[] args) {
		Assistente a = new Assistente("123", "João", 2500., 100.0);
		Gerente g = new Gerente("234", "Maria", 4500., "Financeiro");
		Diretor d = new Diretor("321", "Ana", 9500., "CTO");

		a.aumentarSalario();
		g.aumentarSalario();
		d.aumentarSalario();

		System.out.println(a);
		System.out.println("\n" + g);
		System.out.println("\n" + d);
	}                      

}

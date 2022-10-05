package br.org.serratec.teste;

import br.org.serratec.model.Empresa;
import br.org.serratec.model.Pessoa;
import br.org.serratec.model.TotalTributos;

public class TesteTributos {

	public static void main(String[] args) {
		Empresa e = new Empresa("ABC", 259000.);
		Pessoa p = new Pessoa("João", 82000.);
		TotalTributos t = new TotalTributos();
		
		
		System.out.println(e + "\nTributos à pagar: "
							 + "\nICMS: " + e.calcularICMS()
							 + "\nIR: " + e.calcularImpostoDeRenda());
		System.out.println(p + "\nTributos a pagar: "
							 + "\nIR:" + p.calcularImpostoDeRenda());
		
		t.totalGeralTributos(e);
		t.totalGeralTributos(p);
		
		System.out.println("\n\nTotalização dos tributos: " + t.getTotal());
	}

}

package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class VetorEmpregado {

	public static void main(String[] args) {
		Empregado[]empregados = new Empregado[3];
		
		empregados[0] = new Empregado("João", "162372627");
		empregados[1] = new Empregado("Lucas", "342378297");
		empregados[2] = new Empregado("Roni", "987372627");
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}
	}

}

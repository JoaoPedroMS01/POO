package br.edu.senai.vetor;

public class Exemplo1Vetor {

	public static void main(String[] args) {
		String[] vetor = new String[3];
		vetor[0] = "João";
		System.out.println(vetor[0]);

		// String[] meses = new String[] {"Janeiro", "Fevereiro", "Março"};
		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Junho" };

		for (String mes : meses) {
			System.out.println(mes);
		}
	}

}

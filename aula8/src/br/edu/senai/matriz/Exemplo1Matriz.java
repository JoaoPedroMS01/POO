package br.edu.senai.matriz;

public class Exemplo1Matriz {

	public static void main(String[] args) {
		String pessoas[][] = {{"Marcos", "m@gmail.com"},
							  {"Maria", "maria@gmail.com"},
							  {"Carlos", "c@gmail.com"},
						      {"Adriano", "a@gmail.com"},};
		
		for (int linha = 0; linha < pessoas.length; linha++) {
			System.out.println("\n*********************");
			for (int coluna = 0; coluna < pessoas[linha].length; coluna++) {
				System.out.println(pessoas[linha][coluna]);
			}
		}
	}

}

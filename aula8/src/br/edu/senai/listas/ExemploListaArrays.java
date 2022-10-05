package br.edu.senai.listas;

import java.util.Arrays;
import java.util.List;

public class ExemploListaArrays {

	public static void main(String[] args) {
		// Não pode ser alterada.
		List<String> cores = Arrays.asList("Amarelo", "Verde", "Azul");

		if (cores.isEmpty()) {
			System.out.println("A lista está vazia.");
		} else {
			System.out.println(cores);
		}

		System.out.println("A lista contém a cor verde? " + (cores.contains("Verde") ? "Sim" : "Não"));
		
		//Não pode ser alterada nem modificada.
		List<String> meses = List.of("Jan", "Fev", "Mar");
		
		System.out.println(meses);
		
	}

}

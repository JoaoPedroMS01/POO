package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

	public static void main(String[] args) {
		List listaDeTimes = new ArrayList<>();
		listaDeTimes.add("Flamengo");
		listaDeTimes.add("Basco");
		listaDeTimes.add("Palmeiras");
		listaDeTimes.add("Athletico");
		
		System.out.println("Tamanho da lista: " + listaDeTimes.size());
		System.out.println(listaDeTimes);
		
		listaDeTimes.remove(1);
		listaDeTimes.set(2, "Corinthians");

		System.out.println(listaDeTimes);
	}

}

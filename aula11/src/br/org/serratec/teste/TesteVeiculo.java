package br.org.serratec.teste;

import java.util.HashMap;
import java.util.Map;

public class TesteVeiculo {

	public static void main(String[] args) {
		Map<Integer, String> carros = new HashMap<>();
		carros.put(1, "Civic");
		carros.put(2, "Mustang");
		carros.put(3, "Uno");
		carros.put(4, "Voyage");

		for (Map.Entry<Integer, String> c : carros.entrySet()) {
			System.out.println(c);

		}

	}

}

package br.edu.senai.set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		//Set<String> cores = new HashSet<>();
		Set<String> cores = new TreeSet<>();
		
		cores.add("Vermelho");
		cores.add("Preto");
		cores.add("Vermelho");
		
		System.out.println(cores);
		

	}

}

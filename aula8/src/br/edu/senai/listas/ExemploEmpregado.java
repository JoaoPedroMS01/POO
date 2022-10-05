package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Empregado;

public class ExemploEmpregado {

	public static void main(String[] args) {
		List<Empregado> empregados = new ArrayList<>();
		
		empregados.add(new Empregado("João", "162372627"));
		empregados.add(new Empregado("Matheus", "837748387"));
		empregados.add(new Empregado("Gabriel", "5928438832"));
		
		for (Empregado epg : empregados) {
			System.out.println(epg);
		}
		

	}

}

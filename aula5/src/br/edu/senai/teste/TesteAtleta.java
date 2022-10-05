package br.edu.senai.teste;

import br.edu.senai.model.Atleta;
import br.edu.senai.model.Time;

public class TesteAtleta {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("Pedro", "Centroavante");
		Atleta atleta2 = new Atleta("Arrascaeta", "Meia");
		Atleta atleta3 = new Atleta("Vidal", "Volante");
		Time time1 = new Time("Flamengo", "Dorival Jr.", new Atleta[3]);
		
		time1.adicionarAtletas(atleta1);
		time1.adicionarAtletas(atleta2);
		time1.adicionarAtletas(atleta3);
		
		System.out.println(time1.getNome());
		time1.listarAtletas();
	}

}

package br.org.serratec.teste;

import br.org.serratec.model.AtletaAmador;

public class TesteAtleta {

	public static void main(String[] args) {
		AtletaAmador amador = new AtletaAmador("João", "Masculino", 21, 1.91, true);
		if (amador.podeCompetir()) {
			System.out.println(amador + "\nPode Competir");
		} else {
			System.out.println(amador + "Não pode competir");
		}
	}

}

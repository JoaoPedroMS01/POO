package br.org.serratec.teste;

import br.org.serratec.model.Apartamento;
import br.org.serratec.model.Casa;
import br.org.serratec.model.Proprietario;

public class TesteImovel {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("João");
		Proprietario proprietario2 = new Proprietario("Carlos");
		Casa casa = new  Casa("Centro", 409500., true);
		Apartamento apto = new Apartamento("Centro", 200110.0, 5);
		
		casa.setProprietario(proprietario);
		apto.setProprietario(proprietario2);
		
		System.out.println("Dados do imóvel: " + casa + casa.getProprietario().getNome());
		System.out.println("\nDados do imóvel: " + apto + apto.getProprietario().getNome());
		
	}

}

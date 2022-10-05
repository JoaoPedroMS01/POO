package br.org.serratec.model;

public class TotalTributos {
	private Double total = 0.0;

	public Double getTotal() {
		return total;
	}
	
	//Quem implementa uma interface também pode utilizar o polimorfismo
	public void totalGeralTributos(Tributacao t) {
		total += t.calcularICMS() + t.calcularImpostoDeRenda();
	}
}

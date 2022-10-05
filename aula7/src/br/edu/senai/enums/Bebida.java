package br.edu.senai.enums;

public enum Bebida {
	REFRIGERANTE("Refrigerante", 6.00), 
	AGUA("Água", 2.5), 
	SUCO("Suco de Laranja", 7.0), 
	CERVEJA("Cerveja", 8.);

	private String tipo;
	private Double valor;

	private Bebida(String tipo, Double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public Double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Tipo: " + tipo + "\nValor: " + valor;
	}

}

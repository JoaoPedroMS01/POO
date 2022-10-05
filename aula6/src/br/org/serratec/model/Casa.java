package br.org.serratec.model;

public class Casa extends Imovel {
	private Boolean garagem;

	public Casa(String local, Double valor, Boolean garagem) {
		super(local, valor);
		this.garagem = garagem;
	}

	@Override
	public String toString() {
		return "Casa \nGaragem: " + (garagem ? "Tem garagem." : "Não tem garagem") + "\nLocal: " + local + "\nValor: " + valor;
	}

	public Boolean getGaragem() {
		return garagem;
	}

}

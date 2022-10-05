package br.edu.senai.model;

public class Anestesista extends Medico {
	private String tipoAnestesista;

	public Anestesista(String empresa, Integer crm, String nome,
			String tipoAnestesista) {
		super(empresa, crm, nome);
		this.tipoAnestesista = tipoAnestesista;
	}

	@Override
	public String toString() {
		return super.toString() + "Anestesista [tipoAnestesista=" + tipoAnestesista + "]";
	}

	public String getTipoAnestesista() {
		return tipoAnestesista;
	}
	
	@Override
	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento() + 1000;
	}

}
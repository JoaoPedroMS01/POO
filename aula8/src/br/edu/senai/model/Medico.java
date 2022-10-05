package br.edu.senai.model;

public class Medico {
	private String crm;
	private String nome;
	private Double valorConsulta;

	public Medico(String crm, String nome, Double valorConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.valorConsulta = valorConsulta;
	}

	@Override
	public String toString() {
		return "CRM: " + crm + " Nome: " + nome + " Valor da consulta: " + valorConsulta;
	}

	public String getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public Double getValorConsulta() {
		return valorConsulta;
	}

}

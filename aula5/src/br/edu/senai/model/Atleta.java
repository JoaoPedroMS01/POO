package br.edu.senai.model;

public class Atleta {
	private String nome;
	private String posicao;
	
	public Atleta(String nome, String posicao) {
		this.nome = nome;
		this.posicao = posicao;
	}
	
	public String getNome() {
		return nome;
	}
	public String getPosicao() {
		return posicao;
	}
	
}

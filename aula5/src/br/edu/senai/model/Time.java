package br.edu.senai.model;

public class Time {
	private String nome;
	private String treinador;
	private Atleta[] atletas;

	public Time(String nome, String treinador, Atleta[] atletas) {
		super();
		this.nome = nome;
		this.treinador = treinador;
		this.atletas = atletas;
	}

	public String getNome() {
		return nome;
	}

	public String getTreinador() {
		return treinador;
	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void adicionarAtletas(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				break;
			}
		}
	}

	public void listarAtletas() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println(atletas[i].getNome());
		}
	}

}

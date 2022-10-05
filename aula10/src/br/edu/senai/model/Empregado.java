package br.edu.senai.model;

import java.util.Objects;

public class Empregado {
	private String cpf;
	private String nome;

	public Empregado(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "CPF: " + cpf + " Nome: " + nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}

}

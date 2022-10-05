package model;

public class Funcionario {
	public String nome;
	public Double salario;

	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public Double calcularINSS() {
		Double inss = 0.11 * salario;
		return inss;
	}

	public Double calcularValeTransporte() {
		Double valeT = 0.06 * salario;
		return valeT;
	}

}
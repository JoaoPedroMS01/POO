package br.org.serratec.model;


//Abstract - a classe não poderá ser instanciada.
public abstract class Empregado {
	private String cpf;
	private String nome;
	protected Double salario;
	
	public Empregado(String cpf, String nome, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "CPF: " + cpf + "\nNome: " + nome + "\nSalario: " + String.format("%.2f", salario);
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}
	
	//Assinatura de método abstrato. Não tem implementação.
	//Todos os filhos deverão obrigatoriamente implementar este método.
	public abstract void aumentarSalario();
	
}

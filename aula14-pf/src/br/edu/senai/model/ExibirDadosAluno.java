package br.edu.senai.model;

import java.util.function.Consumer;

public class ExibirDadosAluno implements Consumer<Aluno> {

	@Override
	public void accept(Aluno t) {
		System.out.println("------Dados do aluno------");
		System.out.println("Nome: " + t.getNome());
		System.out.println("Email: " + t.getEmail());
		System.out.println("Idade: " + t.getIdade());
	}

}

package teste;

import model.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		System.out.println("---------------");
		
		//Instância de um objeto
		Aluno aluno1 = new Aluno();
		aluno1.matricula = 123;
		aluno1.nome = "Carlos";
		aluno1.email = "carlos@email.com";
		System.out.println(aluno1.matricula + " - " + aluno1.nome + " - " + aluno1.email);
		
		Aluno aluno2 = new Aluno();

		System.out.println("Aluno1 -" + aluno1);
		System.out.println("Aluno2 -" + aluno2);		
		
		if (aluno1 == aluno2) {
			System.out.println("Objetos iguais");
		} else {
			System.out.println("Objetos diferentes");
		}
	}

}

package teste;

import java.util.Scanner;

public class Teste2EntradaDeDados {

	public static void main(String[] args) {		
		String nome, sobrenome;
		int idade;
		double altura;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite seu sobrenome: ");
		sobrenome = sc.next();
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		System.out.printf("%s % tem %d anos e %.2f de altura.", nome, sobrenome, idade, altura);
	}

}

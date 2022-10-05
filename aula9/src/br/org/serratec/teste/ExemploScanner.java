package br.org.serratec.teste;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploScanner {

	public static Integer lerDados() {
		Integer numero;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		sc.close();
		return numero;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Voce digitou: " + lerDados());
		} catch (InputMismatchException e) {
			System.out.println("Voce não digitou um número.");
		}

	}

}

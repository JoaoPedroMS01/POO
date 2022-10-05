package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Entre com um número: ");
		num = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("| " + i + " X " + num + " = " + i * num + " |");
		}
	}

}
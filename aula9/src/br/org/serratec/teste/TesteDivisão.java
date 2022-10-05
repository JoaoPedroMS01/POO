package br.org.serratec.teste;

import br.org.serratec.calculo.CalculoMedia;

public class TesteDivisão {

	public static void main(String[] args) {
		try {
			System.out.println(CalculoMedia.calcular(12, 0));
		} catch (ArithmeticException e) {
			System.out.println("Erro! Divisão por zero. Verifique seu código.");
			e.printStackTrace();
		} finally {
			System.out.println("Sempre é executado se cair ou não no catch.");
		}

	}

}

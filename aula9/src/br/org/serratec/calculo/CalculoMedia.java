package br.org.serratec.calculo;

public class CalculoMedia {

/*	public static int calcular(int num1, int num2) {
		if (num2 == 0) {
			//throw - lançar uma exception
			throw new ArithmeticException("Você digitou zero no segundo parametro.");
		}
		return num1 / num2;
*/	
	
	//throws - O erro não será tratado no método e sim na classe que chamar esse método.
	public static int calcular(int num1, int num2) throws ArithmeticException {
		return num1 / num2;
	}

}

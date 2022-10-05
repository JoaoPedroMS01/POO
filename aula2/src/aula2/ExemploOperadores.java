package aula2;

public class ExemploOperadores {

	public static void main(String[] args) {
		int idade = 19;
		double altura = 1.65;
		
		if (idade > 18 || altura >= 1.80) {
			System.out.println("Competirá");
		}else {
			System.out.println("Não competirá");
		}
		
		String resposta = idade > 18 || altura >= 1.80 ? "Competirá": "Não Competirá";

	} 
}

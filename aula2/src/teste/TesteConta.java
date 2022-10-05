package teste;

import model.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numeroConta = 1234;
		conta1.titularConta = "Ana Maria";
		conta1.saldo = 1000;
		
		Conta conta2 = new Conta();
		conta2.numeroConta = 234;
		conta2.titularConta = "João";
		conta2.saldo = 5000;
		
		conta1.deposito(500);
		conta2.deposito(100);
		
		if (conta1.saque(200)) {
			System.out.println("Saque efetuado com sucesso.");
		}else {
			System.out.println("Não tem dinheiro.");
		}
		
		System.out.println("Saldo Conta 1: " + conta1.saldo);
		System.out.println("Saldo Conta 2: " + conta2.saldo);
		
	}

}

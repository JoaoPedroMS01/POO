package br.org.serratec.model;

//Uma interface não pode ter instâncias.
//É uma forma de substituir a herança em alguns casos
//Toda interface é criada para ter somente assinaturas.
//Não tem implementação.

public interface Conta {
	Double taxaBancaria = 2.50;
	
	//Não é necessário colocar o abstract nem o public.
	Boolean saque(Double valor);
	Boolean deposito(Double valor);
}

package br.edu.senai.model;

import br.edu.senai.interfaces.Conta;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void investimento() {
		System.out.println("Investimento Ok.");
	}

}

package br.edu.senai.interfaces;

public interface Conta {
	public void transacao();
	
	//Pra interface ser funcional ela pode ter somente um método abstrato.
	
	//Método default - métodos que contém impplementação dentro da interface.
	
	default void investimento() {
		System.out.println("Você aplicou em um investimento.");
	}
	
}

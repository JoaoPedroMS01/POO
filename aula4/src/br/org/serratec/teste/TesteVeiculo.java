package br.org.serratec.teste;

import br.org.serratec.model.Caminhao;
import br.org.serratec.model.VeiculoPasseio;

public class TesteVeiculo {

	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao("123", "KYO-8239", "Preto", 90000., 5000);
		caminhao.calcularIPVA();
		
		VeiculoPasseio vp = new VeiculoPasseio("456", "CLB-4455", "Vermelho", 70000., 4);
		vp.calcularIPVA();
		
		System.out.println("Valor IPVA: " + caminhao.getValorIPVA());
		System.out.println(caminhao.toString());
		System.out.println("\nValor IPVA: " + vp.getValorIPVA());
		System.out.println(vp.toString());
	}

}

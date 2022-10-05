package br.edu.senai.exemplos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Fornecedor;

public class ExemploSerializable {

	public static void main(String[] args) {
		List<Fornecedor> leituraFornecedores = new ArrayList<>();
		List<Fornecedor> gravacaoFornecedores = new ArrayList<>();

		Fornecedor fornecedor1 = new Fornecedor("8378827283", "ABC123 LTDA", "abc@abc.com");
		Fornecedor fornecedor2 = new Fornecedor("1828929281", "XPTO LTDA", "xpto@gmail.com");
		Fornecedor fornecedor3 = new Fornecedor("2877373637", "TDA S/A", "tda@tda.com");

		gravacaoFornecedores.add(fornecedor1);
		gravacaoFornecedores.add(fornecedor2);
		gravacaoFornecedores.add(fornecedor3);

		System.out.println("========Gravar os objetos em disco========");
		try {
			FileOutputStream arquivoGravar = new FileOutputStream("/exemplos/fornecedores.dat");
			ObjectOutputStream gravarObjeto = new ObjectOutputStream(arquivoGravar);
			gravarObjeto.writeObject(gravacaoFornecedores);
			gravarObjeto.flush();
			gravarObjeto.close();
			arquivoGravar.flush();
			arquivoGravar.close();
			System.out.println("Objeto gravado com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}

		System.out.println("========Recuperando objetos=========");
		try {
			FileInputStream arquivoLeitura = new FileInputStream("/exemplos/fornecedores.dat");
			ObjectInputStream leituraObjeto = new ObjectInputStream(arquivoLeitura);
			leituraFornecedores = (ArrayList<Fornecedor>)leituraObjeto.readObject();
			leituraObjeto.close();
			arquivoLeitura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(leituraFornecedores);
	}

}

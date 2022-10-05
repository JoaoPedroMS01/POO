package br.edu.senai.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.edu.senai.model.Empregado;

public class ExemploEmpregadoArquivos {

	public static void main(String[] args) {

		File arquivo = new File("/exemplos/empregados.txt");
		try {
			Scanner sc = new Scanner(arquivo);
			Set<Empregado> empregados = new HashSet<>();
			System.out.println("-----------Leitura do arquivo---------");
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				if (!linha.isEmpty()) {
					String vetor[] = linha.split(";");
					empregados.add(new Empregado(vetor[0], vetor[1]));
				}

			}
			sc.close();

			System.out.println("--------Dados do arquivo--------");
			for (Empregado empregado : empregados) {
				System.out.println(empregado);
			}
			
			System.out.println("---------Gravação do arquivo--------");
			FileWriter arquivoGravar = new FileWriter("/exemplos/empregadosGravar.txt");
			PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
			for (Empregado empregado : empregados) {
				String linha = empregado.getCpf() + ";" + empregado.getNome() + "\n";
				gravacaoArquivo.print(linha);
			}
			System.out.println("Gravado com sucesso.");

		} catch (IOException e) {
			System.out.println("Não funcionou.");
		}
	}

}

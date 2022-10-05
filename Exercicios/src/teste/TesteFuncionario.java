package teste;

import javax.swing.JOptionPane;

import model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Adriano", 3000.0);
		
		JOptionPane.showInternalMessageDialog(null, "Nome: " + funcionario.nome + 
													"\nSalário: " + funcionario.salario + 
													"\nINSS: " + funcionario.calcularINSS() + 
													"\nVale Transporte: " + funcionario.calcularValeTransporte() + 
													"\nSalário Líquido: " + (funcionario.salario - (funcionario.calcularINSS() + funcionario.calcularValeTransporte())));
		
	}

}
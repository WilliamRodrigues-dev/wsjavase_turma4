package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;

public class Teste {

	public static void main(String[] args) {
		//Criando um objeto (não é correto)
		//Aluno objeto;
		
		//Instanciar um objeto
		Aluno objeto = new Aluno();
		objeto.preencherNome(JOptionPane.showInputDialog("Nome:"));
		objeto.preencherNumeroMatricula(Integer.parseInt
					         (JOptionPane.showInputDialog("Número Matricula")));
		objeto.preencherEmail(JOptionPane.showInputDialog("Email: "));
		
		System.out.println("Email: " + objeto.exibirEmail());
		System.out.println("Matrícula: " + objeto.exibirNumeroMatricula());
		System.out.println("Nome do Aluno: " + objeto.exibirNome());
		


		
		
	}

}

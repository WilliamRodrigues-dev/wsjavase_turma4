package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;

public class Teste {

	public static void main(String[] args) {
		//Criando um objeto (n�o � correto)
		//Aluno objeto;
		
		//Instanciar um objeto
		Aluno objeto = new Aluno();
		objeto.preencherNome(JOptionPane.showInputDialog("Nome:"));
		objeto.preencherNumeroMatricula(Integer.parseInt
					         (JOptionPane.showInputDialog("N�mero Matricula")));
		objeto.preencherEmail(JOptionPane.showInputDialog("Email: "));
		
		System.out.println("Email: " + objeto.exibirEmail());
		System.out.println("Matr�cula: " + objeto.exibirNumeroMatricula());
		System.out.println("Nome do Aluno: " + objeto.exibirNome());
		


		
		
	}

}

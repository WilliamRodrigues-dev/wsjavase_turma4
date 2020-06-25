package br.com.universidade.implementacao;

import javax.swing.JOptionPane;

import br.com.universidade.modelo.Aluno;

public class TesteTudo {
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.preencherTudo(
				JOptionPane.showInputDialog("Nome"), 
				Integer.parseInt(JOptionPane.showInputDialog("Matricula")), 
				JOptionPane.showInputDialog("Email")
				);
		System.out.println(aluno.exibirTudo());

	}

}

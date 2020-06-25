package br.com.polimorfismo.tela;

import javax.swing.JOptionPane;

public class Magica {
	
	public static boolean b(String msg) {
		msg+="\nDigite:\n<S> para Sim ou\n<N> para Não";
		if (s(msg).equals("S")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	
	
}

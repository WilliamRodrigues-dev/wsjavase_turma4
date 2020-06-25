package br.com.excecao.implementacao;

import br.com.excecao.excecao.Excecao;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
			//String time="PALMEIRAS";
			//if (time.equals("PALMEIRAS")) {
			//	throw new RuntimeException();
			//}
			int x = Integer.parseInt("1");
			System.out.println(x);
		
			String y = "";
			System.out.println(y.length());
			
			int[] z = new int[3];
			z[0]=10;
			z[1]=5;
			z[2]=6;
			
		}catch(Exception e) {
			System.out.println(Excecao.tratarExcecao(e));
		}finally {
			//fechar a conexao com o banco de dados
			System.out.println("Fechando o banco de dados...");
		}
	
	}

}

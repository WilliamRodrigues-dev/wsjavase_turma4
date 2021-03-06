package br.com.loja.principal;

import br.com.loja.beans.Autor;
import br.com.loja.beans.CD;
import br.com.loja.beans.Livro;
import br.com.loja.beans.Produto;
import br.com.loja.tela.Magica;

public class ImplementarProdutoComHeranca5 {

	public static void main(String[] args) {
		char opcao = Magica.s("Digite:\n<1> CD ou\n<2> Livro").charAt(0);
		Produto produto = null;
		if (opcao=='1') {
			produto = new CD(
					Magica.i("C�digo:"),
					Magica.s("Descricao"),
					Magica.f("Valor Venda: "),
					Magica.f("Valor Compra: "),
					Magica.s("Artista"),
					Magica.s("Gravadora")
					);
		}else if (opcao=='2') {
			produto = new Livro(
					Magica.i("ID"),
					Magica.s("Descri��o"),
					Magica.f("Venda"),
					Magica.f("Compra"),
					new Autor(
							Magica.s("Academico"),
							Magica.s("Email"),
							Magica.s("Nome")
							),
					Magica.s("Editora"),
					Magica.s("ISBN")
					);
		}else {
			System.out.println("Op��o inv�lida!!!!");
		}
		System.out.println(produto.getAll());
	}

}

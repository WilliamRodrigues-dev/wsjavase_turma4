package br.com.loja.principal;

import br.com.loja.beans.Produto;

public class ImplementarProduto {

	public static void main(String[] args) {
		// não instancia por que colocamos o abstract no Produto
		Produto objeto2 = new Produto(1, "CHURROS", 20, 10);
		Produto objeto = new Produto();
		objeto.setCodigo(1);
		objeto.setDescricao("CANETA AZUL");
		objeto.setValorVenda(10);
		objeto.setValorCompra(8);
		//Testando getVenda()
		System.out.println("Teste getVenda()\n" + objeto.getVenda());
		//Testando getValorVista()
		System.out.println("Valor vista: " + objeto.getValorVista());
		//Testando atualizarValor()
		objeto.atualizarValor(20);
		System.out.println("Valor de Compra atualizado: " + 
								objeto.getValorCompra());
		//Teste getValorVista(porcentagem)
		System.out.println("Teste getVenda(porc): "  + objeto.getValorVista(30));
		// Teste getSubTotalVendas(qtde)
		System.out.println("Subtotal Vendas: " + objeto.getSubTotalVenda(10));
		// Teste getSubTotalCompras(qtde)
		System.out.println("Subtotal Compras: " + objeto.getSubTotalCompra(10));
		// Teste atualizarValorDesconto (porcentagem)
		objeto.atualizarValorDesconto(50);
		System.out.println("Abaixar o valor de compra: " + objeto.getValorCompra());
		// Teste getPromocaoEspecial(descricao, porcentagem)
		System.out.println("Promo Especial: "+
				objeto.getPromocaoEspecial("CANETA AZUL", 50));
		
		  
		
		
		

	}

}

package br.com.loja.beans;

//Regras dos Beans (modelo):
// 1º - TODO ATRIBUTO DEVE SER PRIVATE
// 2º - DEVE HAVER UM GETTER E UM SETTER PARA CADA ATRIBUTO
// 3º - DEVE HAVER UM CONSTRUTOR CHEIO E UM CONSTRUTOR VAZIO

public abstract class Produto {
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	
	public void definirValorVenda() {}
	
	public String getAll() {
		return id + "\n" + descricao + "\n" + valorVenda + "\n" + valorCompra ;
	}
	
	public Produto() {}
	
	public Produto(int pId, String pDescricao, float pValorVenda, float pValorCompra) {
		id = pId;
		descricao= pDescricao;
		valorVenda= pValorVenda;
		valorCompra=pValorCompra;
	}
	
	
	// Sintaxe dos métodos (Geral)
	// <modificador> <retorno> <nome>(<tipo param> <nome param...1> ){}
	
	
	public float getPromocaoEspecial(String descricao, float porcentagem) {
		if (descricao.equals(this.descricao)) {
			return valorVenda - valorVenda * (porcentagem/100);
			// return getValorVista(porcentagem);
		}else {
			return valorVenda;
		}
	}
	
	//deve retornar o valor de venda com 10% de desconto
	public float getValorVista() {
		return valorVenda*0.9f;
	}
	
	// retornar o valor de venda com o desconto conforme a porcentagem recebida
	public float getValorVista(float porcentagem) {
			return valorVenda - valorVenda * (porcentagem/100);
	}
	
	// retornar o valor de venda vezes a quantidade, se a quantidade for menor que 
	// zero deverá retornar 0;
	public float getSubTotalVenda(int quantidade) {
		if (quantidade>0) {
			return valorVenda*quantidade;
		}else {
			return 0;
		}
		
	}

	// retornar o valor de compra vezes a quantidade, se a quantidade for menor que 
	// zero deverá retornar 0;	
	public float getSubTotalCompra(int quantidade) {
		if (quantidade>0) {
			return valorCompra*quantidade;
		}else {
			return 0;
		}
	}
	// deve alterar o valor da compra com um desconto conforme a porcentagem informada
	public void atualizarValorDesconto(float porcentagem) {
		valorCompra = valorCompra - valorCompra * (porcentagem/100);
	}
	
	//deve alterar o valorCompra conforme a porcentagem inserida no parâmetro
	public void atualizarValor(float porcentagem) {
		valorCompra = valorCompra + valorCompra * (porcentagem/100);
	}
	

	
	//deve retornar somente o a descrição e o valor de venda do produto
	public String getVenda() {
		return descricao.toUpperCase() + "\n" + valorVenda;
	}
	
	public int getCodigo() {
		return id;
	}
	public void setCodigo(int codigo) {
		this.id = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

}

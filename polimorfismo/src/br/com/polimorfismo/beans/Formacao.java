package br.com.polimorfismo.beans;

/*
 * Pilares da OO
 * 1� Abstra��o => efetivamente fa�a uma an�lise consistente
 * 2� Encapsulamento => mostre e d� acesso somente o que for necess�rio
 * 3� Heran�a => agrupe grupos de objetos, facilitando manuten��o e reaproveitamento
 * 4� Polimorfismo => m�todos com mesmo e fun��es distintas. Dois tipos:
 * - Overriding (sobrescrita) => m�todos em classes diferentes.
 * - Overload (sobrecarga) => m�todos na mesma classe
 *  (obrigatoriamente com assinaturas distintas).
 */
public class Formacao {
	private String descricao;
	private int periodo;
	private double mensalidade;
	private int duracao;
	
	public void calcularMensalidade(double fator) {}
	
	public void definirDuracao() {
		if (this instanceof Medio) {
			duracao=36;
		}else if (this instanceof Tecnologo) {
			duracao=24;
		}else if(this instanceof Bacharelado) {
			if (descricao.indexOf("ENGENHARIA")==-1) {
				duracao=48;
			}else {
				duracao=60;
			}
		}
	}
	
	public double exibirMedia(double ps1, double ps2) {
		return (ps1+ps2)/2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return (((ps1+ps2) * 0.8) + ((nac1+nac2) * 0.2))/2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		return (((ps1+ps2) * 0.5) + ((nac1+nac2) * 0.2) + ((am1+am2) * 0.3))/2;
	}
	
	public String getAll() {
		return descricao + "\n" + periodo + "\n" + mensalidade + "\n" + duracao; 
	}
	
	public Formacao() {
		super();
		descricao=new String();
	}
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}

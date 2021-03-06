package br.com.polimorfismo.beans;

public class Medio extends Formacao{
	private String tipo;
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao()*fator*500);
	}
	
	public String getAll() {
		return super.getAll() + "\n" + tipo;
	}
	
	public Medio() {
		super();
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}

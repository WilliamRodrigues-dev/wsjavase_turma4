package br.com.polimorfismo.beans;

public class Bacharelado extends Formacao{
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade((super.getDuracao()*fator*600)+ (cargaHorariaEstagio*12));
	}
	
	public String getAll() {
		return super.getAll()  + "\n" + projetoConclusao + "\n" + cargaHorariaEstagio;
	}
	
	public Bacharelado() {
		super();
	}
	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

}

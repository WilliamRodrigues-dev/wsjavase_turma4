package br.com.universidade.modelo;
/*
 * Dentro de um classe Modelo (Beans - Transact Object (TO)), é obrigatório:
 * - atributos privados
 * - métodos getters (output) e setters (input)
 */
public class Professor {

	private int id;
	private String contratacao;
	private String nome;
	private String apelido;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContratacao() {
		return contratacao;
	}
	
	public void setContratacao(String contratacao) {
		this.contratacao = contratacao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	
	
	
}

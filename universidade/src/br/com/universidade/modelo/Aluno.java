package br.com.universidade.modelo;

public class Aluno {
	private String nome;
	private int numeroMatricula;
	private String email;
	public String exibirTudo() {
		return "Aluno: " + nome + "\nMatrícula: " + numeroMatricula + "\nEmail: " + email;
	}
	public void preencherTudo(String pNome, int pNumeroMatricula, String pEmail) {
		nome=pNome;
		numeroMatricula=pNumeroMatricula;
		email=pEmail;
	}
	public String exibirEmail() {
		return email;
	}
	public void preencherEmail(String pEmail) {
		email = pEmail.toLowerCase();
	}
	public int exibirNumeroMatricula() {
		return numeroMatricula;
	}
	public void preencherNumeroMatricula(int pNumeroMatricula) {
		numeroMatricula=pNumeroMatricula;
	}
	public void preencherNome(String pNome) {
		if (pNome.length()<=50) {
			nome = pNome.toUpperCase();
		}
	}
	
	public String exibirNome() {
		return nome;
	}
	
	
}

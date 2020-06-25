package br.com.universidade.implementacao;

import br.com.universidade.modelo.Professor;

public class TesteProfessor {

	public static void main(String[] args) {
		Professor objeto = new Professor();
		objeto.setApelido("1berto");
		objeto.setContratacao("01/01/01");
		objeto.setId(1);
		objeto.setNome("Humberto Delgado");
		System.out.println(objeto.getApelido());
		System.out.println(objeto.getContratacao());
		

	}

}

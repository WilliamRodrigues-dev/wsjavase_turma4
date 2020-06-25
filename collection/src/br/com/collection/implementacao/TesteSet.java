package br.com.collection.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set lista = new HashSet();
		
		lista.add("DBA");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");
		lista.add("DEV");
		lista.add("SEC");
		//sort() não funciona com o Set.
		//Collections.sort(lista);
		System.out.println(lista);
		System.out.println(lista.contains("DBA"));
		
	}

}

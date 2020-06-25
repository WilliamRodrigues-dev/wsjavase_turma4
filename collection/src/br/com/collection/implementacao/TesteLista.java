package br.com.collection.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TesteLista {

	public static void main(String[] args) {
		//A forma abaixo não é a mais indicada
		//ArrayList teste = new ArrayList();
		
		//Correto:
		// Cria pela super e instancia pela sub
		List lista = new ArrayList();
		lista.add("DBA");  //0
		lista.add(15000); // 1
		lista.add("ESTAGIARIO"); //2
		lista.add(1500);
		lista.add("ANALISTA"); // 4
		lista.add(13000);
		lista.add("DBA");
		lista.add(15000);
		System.out.println(lista);
		for (int cont=1;cont<lista.size();cont+=2) {
			System.out.println(lista.get(cont));
		}
		
		
		}

}










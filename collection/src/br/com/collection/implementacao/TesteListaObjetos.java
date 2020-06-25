package br.com.collection.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.collection.beans.Cargo;

public class TesteListaObjetos {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		lista.add(new Cargo("DBA",15000,"PL"));
		lista.add(new Cargo("ESTAGIARIO",1500,"JR"));
		lista.add(new Cargo("ANALISTA",18000,"SR"));
		//System.out.println(lista.get(1).getNome());
		//Foreach
		//Crie um "objeto" "Cargo" para cada elemento da "lista"
		
		Collections.sort(lista);
		
		for(Cargo objeto : lista) {
			System.out.println(objeto.getNome());
			System.out.println(objeto.getNivel());
			System.out.println(objeto.getSalario());
			System.out.println("===================");
		}
		
		
	}

}

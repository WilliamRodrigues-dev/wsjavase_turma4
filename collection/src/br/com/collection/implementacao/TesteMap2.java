package br.com.collection.implementacao;

import java.util.HashMap;
import java.util.Map;

import br.com.collection.beans.Cargo;

public class TesteMap2 {

	public static void main(String[] args) {
		Map<Integer, Cargo> lista = new HashMap<Integer,Cargo>();
		lista.put(1, new Cargo("DBA",15000,"PL"));
		lista.put(2, new Cargo("ESTAGIARIO",1500,"PL"));
		lista.put(3, new Cargo("DBA",10000,"JR"));
		//System.out.println(lista);
		for (Cargo objeto : lista.values()) {
			System.out.println(objeto.getNome());
			System.out.println(objeto.getSalario());
		}
		//Para saber as chaves
		System.out.println(lista.keySet());
	}
}

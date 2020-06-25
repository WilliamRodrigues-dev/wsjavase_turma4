package br.com.collection.implementacao;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

	public static void main(String[] args) {
		Map<Integer, String> lista = new HashMap<Integer, String>();
		lista.put(1, "DBA");
		lista.put(2, "DEV");
		lista.put(3, "DBA");
		System.out.println(lista);
	}

}

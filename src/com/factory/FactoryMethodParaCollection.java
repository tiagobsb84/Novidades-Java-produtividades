package com.factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethodParaCollection {
	
	public static void main(String[] args) {
		/*
		List<String> nomes = new ArrayList<String>();
		nomes.add("Primeiro nome");
		nomes.add("Segundo nome");
		nomes.add("Terceiro nome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		*/
		
		List<String> nomes = List.of("primeiro nome", "segundo nome");
		System.out.println(nomes);
		
		Set.of("primeiro nome", "segundo nome");
		Map.of("primeiro nome", "segundo nome");
		
		/*Ocorrera uma exception
		nomes.add("terceiro nome");
		System.out.println(nomes);*/
	}
}

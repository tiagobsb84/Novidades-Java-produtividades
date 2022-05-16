package com.factory;

import java.util.HashMap;
import java.util.Map;

public class UsandoVar {
	public static void main(String[] args) {
		var cpfNomes = new HashMap<String, String>();
		cpfNomes.put("Fulano Nunes", "123.453.234-32");
		System.out.println(cpfNomes);
	}
}

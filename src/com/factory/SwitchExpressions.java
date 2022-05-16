package com.factory;

public class SwitchExpressions {

	public static void main(String[] args) {
		
		String nome = "Fulano";
		
		/*switch (nome){
		case "Beltrano": {
			System.out.println("Acertou:" + nome);
			break;
		}
		case "Fulano": {
			System.out.println("Acertou:" + nome);
			break;
		}
		default:
			System.out.println("Nome:" + nome + " não encontrado.");
		}*/
		
		switch (nome) {
		case "Beltrano" -> System.out.println("Acertou:" + nome);
		case "Fulano" -> System.out.println("Acertou:" + nome);
		default -> System.out.println("Nome:" + nome + " não encontrado.");
		}
	}
}

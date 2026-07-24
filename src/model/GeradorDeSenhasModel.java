package model;

import java.security.SecureRandom;

public class GeradorDeSenhasModel {
	
	private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]|,./?><";
	private static final SecureRandom GERADOR = new SecureRandom();
	
	public static String gerarSenha(int comprimento) {
		if (comprimento <= 0) {
			throw new IllegalArgumentException ("O tamanho deve ser maior que zero");
		}
		
		StringBuilder senha = new StringBuilder(comprimento);	
		for (int i = 0; i < comprimento; i ++) {
			int indice = GERADOR.nextInt(CARACTERES.length());
			senha.append(CARACTERES.charAt(indice));
		}
		
		return senha.toString();
	}
}

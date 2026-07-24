package model;

import java.security.SecureRandom;

public class GeradorDeSenhasModel {
	
	private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]|,./?><";
	
	public static String gerarSenha(int comprimento) {
		SecureRandom geradorDeNumeroAleatorio = new SecureRandom();
		StringBuilder senha = new StringBuilder(comprimento);
		
		for (int i = 0; i < comprimento; i ++) {
			int indice = geradorDeNumeroAleatorio.nextInt(CARACTERES.length());
			senha.append(CARACTERES.charAt(indice));
		}
		
		return senha.toString();
	}
}

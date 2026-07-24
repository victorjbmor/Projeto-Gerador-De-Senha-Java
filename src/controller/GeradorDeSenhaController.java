package controller;

import model.GeradorDeSenhaModel;
import view.GeradorDeSenhaView;

public class GeradorDeSenhaController {

	private final GeradorDeSenhaView view;
	
	public GeradorDeSenhaController(GeradorDeSenhaView view) {
		this.view = view;
		registrarEventos();
	}
	
	private void registrarEventos() {
		view.getBotaoGerarSenha().setOnAction(_ -> executarGeracaoDeSenha());
	}
	
	private void executarGeracaoDeSenha() {
		try {
			String textoEntrada = view.getCampoTamanhoSenha().getText().trim();
			int tamanhoSenha = Integer.parseInt(textoEntrada);
			
			String senha = GeradorDeSenhaModel.gerarSenha(tamanhoSenha);
			view.getCampoSenhaGerada().setText(senha);
		
		} catch (NumberFormatException ex) {
			view.getCampoSenhaGerada().setText("Erro: Digite um número válido");
		} catch (IllegalArgumentException ex) {
			view.getCampoSenhaGerada().setText(ex.getMessage());
		}
	}
}

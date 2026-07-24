package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class GeradorDeSenhaView {
	
	private final VBox layout;
	private final TextField campoTamanhoSenha;
	private final TextField campoSenhaGerada;
	private final Button botaoGerarSenha;
	
	public GeradorDeSenhaView() {
       
		Label labelTamanhoSenha = new Label("Tamanho da Senha:");
        campoTamanhoSenha = new TextField();
        campoTamanhoSenha.setStyle("-fx-text-fill: black; -fx-background-color: white;");

        Label labelSenhaGerada = new Label("Senha Gerada:");
        campoSenhaGerada = new TextField();
        campoSenhaGerada.setEditable(false);
        campoSenhaGerada.setStyle("-fx-text-fill: black; -fx-background-color: white;");

        botaoGerarSenha = new Button("Gerar Senha");
        botaoGerarSenha.setAlignment(Pos.CENTER);
        botaoGerarSenha.setStyle("-fx-text-fill: black; -fx-background-color: white;");

        layout = new VBox(10, labelTamanhoSenha, campoTamanhoSenha, botaoGerarSenha, labelSenhaGerada, campoSenhaGerada);
        layout.setPadding(new Insets(15));
        layout.setStyle("-fx-background-color: #2b2b2b; -fx-text-fill: white;");
    }
	
	public Scene getCena() {
		return new Scene(layout,300,200);
	}
	
	// Getters para o Controller associar os eventos e ler/escrever dados
    public TextField getCampoTamanhoSenha() {
        return campoTamanhoSenha;
    }

    public TextField getCampoSenhaGerada() {
        return campoSenhaGerada;
    }

    public Button getBotaoGerarSenha() {
        return botaoGerarSenha;
    }
}


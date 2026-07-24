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
        // Label Tamanho da Senha
        Label labelTamanhoSenha = new Label("Tamanho da Senha:");
        labelTamanhoSenha.setStyle("-fx-text-fill: yellow; -fx-font-weight: bold;"); // Texto Amarelo

        campoTamanhoSenha = new TextField();
        campoTamanhoSenha.setStyle("-fx-text-fill: black; -fx-background-color: white;");

        // Label Senha Gerada
        Label labelSenhaGerada = new Label("Senha Gerada:");
        labelSenhaGerada.setStyle("-fx-text-fill: yellow; -fx-font-weight: bold;"); // Texto Amarelo

        campoSenhaGerada = new TextField();
        campoSenhaGerada.setEditable(false);
        campoSenhaGerada.setStyle("-fx-text-fill: black; -fx-background-color: white;");

        // Botão
        botaoGerarSenha = new Button("Gerar Senha");
        botaoGerarSenha.setAlignment(Pos.CENTER);
        botaoGerarSenha.setStyle("-fx-text-fill: black; -fx-background-color: white;");

        // Layout Principal
        layout = new VBox(10, labelTamanhoSenha, campoTamanhoSenha, botaoGerarSenha, labelSenhaGerada, campoSenhaGerada);
        layout.setPadding(new Insets(15));
        layout.setStyle("-fx-background-color: #2b2b2b;");
    }

    public Scene getCena() {
        return new Scene(layout, 320, 240);
    }

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

package application;

import controller.GeradorDeSenhaController;
import javafx.application.Application;
import javafx.stage.Stage;
import view.GeradorDeSenhaView;

public class App extends Application {
	
	@Override
	public void start(Stage palco) {
		GeradorDeSenhaView view = new GeradorDeSenhaView();
		
		new GeradorDeSenhaController(view);
		
		palco.setTitle("Gerador de Senhas");
		palco.setScene(view.getCena());
		palco.show();
	}
	
	public static void main (String[] args) {
		launch(args);
	}
}

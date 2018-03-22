package it.polito.tdp.indonumero;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//legge fxml
			FXMLLoader loader = new FXMLLoader(getClass().getResource("IndoNumero.fxml"));
			BorderPane root = (BorderPane)loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			Model model = new Model();
			//mi dice la classe del controller
			((IndoNumeroController)loader.getController()).setModel(model);
			//il cast fatto sopra serve perchè il loader è una classe generica e non può sapere come si chiama il controller
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

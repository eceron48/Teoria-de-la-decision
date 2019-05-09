package dadovirtual.vistas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	Parent inicio =FXMLLoader.load(getClass().getResource("/dadovirtual/vistas/inicio.fxml"));
	Scene scene=new Scene(inicio); 
	primaryStage.setScene(scene);
	primaryStage.show();
		
	}
	public static void main( String[] args ){
		
	launch(args);
	}

}

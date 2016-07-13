package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Login extends Application {
	
	AnchorPane root;
	private static Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			root = (AnchorPane)FXMLLoader.load(getClass().getResource("/br/com/intelech/view/Login.fxml"));
			
			Scene scene = new Scene(root);	
			scene.getStylesheets().add(getClass().getResource("/resources/css/style.css").toExternalForm());
			
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			Login.primaryStage = primaryStage;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}

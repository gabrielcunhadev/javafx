package br.com.intelech.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Login;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	@FXML private TextField tfUsuario;
	@FXML private PasswordField pfSenha;
	@FXML private Label lbLoginErro;
	@FXML private Label lbLoginErro1;
	@FXML private Button btLogar;
	@FXML private Button btSair;
	private String usuario;
	private String senha;
	private static Stage Stage;
	
	public static Stage getStage() {
		return Stage;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btLogar.setTooltip(new Tooltip("Entrar no sistema"));
	}

	@FXML
	public void onActionLogar(){
		usuario = tfUsuario.getText();
		senha = pfSenha.getText();

		if(isAutorizado()){
			try{
				Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/br/com/intelech/view/Dashboard.fxml"));
				Scene scene = new Scene(parent);
				scene.getStylesheets().add(getClass().getResource("/resources/css/style.css").toExternalForm());
				Stage stage = new Stage();
				stage.setScene(scene);
				stage.setMaximized(true);
				stage.setResizable(false);
				stage.show();
				Login.getPrimaryStage().close();				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * Verifica se login e senha estão corretos e retorna boolean
	 */
	private boolean isAutorizado(){
	
		if(usuario.equals("admin") && senha.equals("admin")){
			return true;
		}else{
			lbLoginErro.setText("Usuário ou senha inválidos!");
			lbLoginErro1.setText("Digite novamente.");
			tfUsuario.setText("");
			pfSenha.setText("");
			requestFocus();
			return false;
		}
	}

	/*
	 * Define o foco no campo desejado
	 */
	private void requestFocus() {
    	javafx.application.Platform.runLater(new Runnable() {
            @Override
            public void run() {
            	tfUsuario.requestFocus();
            }
        });
    }
	
	@FXML 
	public void onActionSair(){
		System.exit(0);
	}

	public static void setPrimaryStage(Stage primaryStage) {
		LoginController.Stage = primaryStage;
	}	
}

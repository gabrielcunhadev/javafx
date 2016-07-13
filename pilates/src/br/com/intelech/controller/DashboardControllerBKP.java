package br.com.intelech.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.intelech.util.FXUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DashboardControllerBKP implements Initializable {
	
	@FXML private Button btHome;
	@FXML private Button btCadastros;
	@FXML private Button btSair;	
	// @FXML private StackPane stack;
	
	@Override
	public void initialize(URL url, ResourceBundle bundle) {
		
	}
	
	
//	@FXML
//	public void onActionHome() {
//		stack.getChildren().clear();
//    }
	
	@FXML
	public void onActionTelaCadastroPaciente() {
		alternaJanelas("/br/com/intelech/view/CadastroPaciente.fxml");
	}
	
//	public ImageView insereLogo(String endereco){
//		ImageView imagem;
//		return imagem = new ImageView(new Image(endereco));
//	}
	
	private void alternaJanelas(String no){
		try{
			AnchorPane cadastroCliente = (AnchorPane) FXMLLoader.load(getClass().getResource(no));
			Scene scene = new Scene(cadastroCliente);
			scene.getStylesheets().add(getClass().getResource("/resources/css/style.css").toExternalForm());
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
			
			//Main.getPrimaryStage().close();
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
	
//	private Node getNode(String node) {
//		  Node no = null;
//        try {
//           no = FXMLLoader.load(getClass().getResource(node));
//        } catch (Exception e) {
//        }
//		return no;
//	}
	
	@FXML
	private void onActionSair() {
	   if (FXUtil.confirma("Mensagem", "Finalizar o aplicativo?", "")) {
	       try {	
			 } catch (Exception e) {
				 FXUtil.alerta("Mensagem", null, e.getMessage());
			 }
	       	 System.exit(0);
	    }
	}

}

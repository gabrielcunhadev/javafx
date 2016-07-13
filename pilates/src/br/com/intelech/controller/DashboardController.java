package br.com.intelech.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.intelech.util.FXUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class DashboardController implements Initializable {
	@FXML private Button btInicio;
	@FXML private static Button btCadastros;
	@FXML private Button btConfiguracoes;
	@FXML private Button btSair;	
	@FXML private StackPane stack;
	
	@Override
	public void initialize(URL url, ResourceBundle bundle) {
	
	}	
	
	@FXML
	public void onActionInicio() {
		stack.getChildren().clear();
    }
	
	@FXML
	public void onActionCadastros() {
		stack.getChildren().clear();
		stack.getChildren().add(getNode("/br/com/intelech/view/Cadastros.fxml"));      
	}	
	
	@FXML
	public void onActionConfiguracoes() {
		stack.getChildren().clear();
        stack.getChildren().add(getNode("/br/com/intelech/view/Configuracoes.fxml"));	
       
	}	
	
	
	private Node getNode(String node) {
		  Node no = null;
		  try {
		     no = FXMLLoader.load(getClass().getResource(node));
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		return no;
	}
	
	
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

	public static Button getBtCadastros() {
		return btCadastros;
	}

	
	
}

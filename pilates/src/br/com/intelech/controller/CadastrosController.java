package br.com.intelech.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.intelech.util.FXUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadastrosController implements Initializable {


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	
	@FXML
	public void onActionCadastroPaciente(){	
		Parent parent;
		try {
			parent = (Parent) FXMLLoader.load(getClass().getResource("/br/com/intelech/view/CadastroPaciente.fxml"));
			Scene scene = new Scene(parent);
			scene.getStylesheets().add(getClass().getResource("/resources/css/style.css").toExternalForm());
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
		} catch (IOException e) {
			FXUtil.mensagem("Inicializando Tela de Cadastro de Cliente", "Erro ao abrir tela de Cadastro de Cliente!",  "");
			e.printStackTrace();
		}
		
	}

}

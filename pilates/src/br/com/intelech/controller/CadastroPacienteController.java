package br.com.intelech.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.intelech.model.Sexo;
import br.com.intelech.util.FXUtil;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class CadastroPacienteController implements Initializable {
	@FXML private TextField tfmatricula;
	@FXML private TextField tfNome;
	@FXML private ComboBox<String> cbSexo;
	@FXML private ImageView ivfotoPaciente;
	@FXML private Button btCadastroPaciente;
	
	//ObservableList<String> sexoLista;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cbSexo = new ComboBox<String>();
		try{
			cbSexo.getItems().addAll(Sexo.getM(), Sexo.getF()); // Adiciono a lista de opções de sexo na ComboBox cbSexo	
		}catch(Exception e){
			FXUtil.mensagem("Problema de inicialização de tela", "Erro tela de Cadastro de Paciente", e.getMessage());
		}
		
		
	}
	
	@FXML 
	public void onActionCadastroPaciente(){
		
	}
	
	@FXML
	public void onActionAddFoto(){
		
	}
	
	@FXML
	public void onActionExcluirFoto(){
		
	}
	
	
	
}

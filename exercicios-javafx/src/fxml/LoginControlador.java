package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private TextField campoSenha;
	
	public void entrar() {
		System.out.println(campoEmail.getText());
		System.out.println(campoSenha.getText());
	}
}

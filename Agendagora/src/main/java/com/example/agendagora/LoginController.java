package com.example.agendagora;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

public class LoginController {
    @FXML
    TextField usuarioField;
    @FXML
    PasswordField senhaField;


    @FXML
    public void entrar () throws IOException, SQLException {
        Usuario usariologin=new Usuario(usuarioField.getText(),senhaField.getText());
        boolean usuarioexiste= new UsuarioDAO().existe(usariologin);

        if (usuarioexiste){
            AgendaApplication.setRoot("menu-principal-view");
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle(null);
            alert.setHeaderText(null);
            alert.setContentText("Usuario ou senha incorretos!!");
            alert.showAndWait();

        }
    }


}
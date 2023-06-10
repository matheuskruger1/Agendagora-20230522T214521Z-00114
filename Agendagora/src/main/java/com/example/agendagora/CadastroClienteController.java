package com.example.agendagora;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CadastroClienteController implements Initializable {


    @FXML
    TextField codigoField;

    @FXML
    TextField nomeField;

    @FXML
    TextField enderecoField;

    @FXML
    TextField telefoneField;

    public static Cliente cliente;

    @FXML
    public void salvar() {
        Cliente novoCliente = new Cliente();
        novoCliente.codigo = Integer.parseInt(codigoField.getText());
        novoCliente.nome = nomeField.getText();
        novoCliente.endereco = enderecoField.getText();
        novoCliente.telefone = telefoneField.getText();

        cliente = novoCliente;

        AgendaApplication.closeCurrentWindow();

    }
    @FXML
    public void cancelar() {
        AgendaApplication.closeCurrentWindow();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Cliente clienteselecionado = CadastroClienteController.cliente;

        if (clienteselecionado != null) {
            codigoField.setText(Integer.toString(clienteselecionado.codigo));
            nomeField.setText(clienteselecionado.nome);
            enderecoField.setText(clienteselecionado.endereco);
            telefoneField.setText(clienteselecionado.telefone);

        }
    }
}



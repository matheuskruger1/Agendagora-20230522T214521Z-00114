package com.example.agendagora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class AgendaApplication extends Application {
    private static Scene scene;
    private static Stage modalDialog;

    public void start(Stage stage) throws IOException, java.io.IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(AgendaApplication.class.getResource("login-view.fxml"));
        scene = new Scene(loadFXML("login-view"), 800, 600);
        stage.setTitle("AgendAgora!");
        stage.setScene(scene);
        //stage.setMaximized(true);
        stage.show();
    }

    /**
     * Exibe uma janela em modo modal com base no nome do arquivo fxml
     */
    public static void showModal(String fxml) throws IOException, java.io.IOException {
        // Obtém a tela atual
        Window primaryStage = scene.getRoot().getScene().getWindow();

        // Carrega a nova tela
        Scene scene = new Scene(loadFXML(fxml));

        // Abre o modal
        modalDialog = new Stage();
        modalDialog.initModality(Modality.APPLICATION_MODAL);
        modalDialog.initOwner(primaryStage);
        modalDialog.setScene(scene);
        modalDialog.showAndWait();
    }

    public static void main(String[] args) {

        launch();

    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AgendaApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Fecha a janela atual
     */
    public static void closeCurrentWindow() {
//        ((Stage) scene.getRoot().getScene().getWindow()).close();
        modalDialog.close();
    }

}
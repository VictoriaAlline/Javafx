package com.group.projetowatch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class Inicializador extends Application {
    @Override
    public void start(Stage stage) throws IOException {
         String info = "telaInfo";
         String init = "TelaInicio";
         String telalogin = "LoginSemIcone";
         String cad = "CadastroSemIcone";


        FXMLLoader fxmlLoader = new FXMLLoader(Inicializador.class.getResource(cad + ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1338, 700);

        //carregar o arquivo de estilo css
        scene.getStylesheets().add(getClass().getResource("/com/group/projetowatch/estilos/info.css").toExternalForm());

        stage.setTitle("Janela inicial");
        stage.setMinHeight(700);
        stage.setMinWidth(1300);
        stage.setMaximized(true);
        stage.setMaxWidth(1400);


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}
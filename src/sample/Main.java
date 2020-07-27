package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;


public class Main extends Application{
    //Declares Buttons
    Button startButton;
    Button exitButton;
    //Declares Labels
    Label GMLabel;
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Creates Start Button
        startButton = new Button();
        startButton.setText("Run GalaxyOS");
        startButton.setOnAction(e-> {
            LoginScreen.Login();
            primaryStage.close();
        });
        //Creates Exit Button
        exitButton = new Button();
        exitButton.setText("Exit");
        exitButton.setOnAction(e-> primaryStage.close());
        //Creates GMLabel
        GMLabel = new Label();
        GMLabel.setText("GalaxyOS Manager");

        //Layouts
        //Top Border Layout
        StackPane TopBorder = new StackPane();
        TopBorder.getChildren().add(GMLabel);
        //Bottom Border Layout
        StackPane BottomBorder = new StackPane();
        BottomBorder.getChildren().add(exitButton);
        //Layout
        BorderPane layout = new BorderPane();
        layout.setCenter(startButton);
        layout.setBottom(BottomBorder);
        layout.setTop(TopBorder);
        //Window
        primaryStage.setTitle("GalaxyOS Manager");
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}

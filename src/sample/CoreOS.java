package sample;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.image.*;

import javafx.scene.control.Button;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CoreOS {

    public static void OS() {

        //Add Images
        try {
            FileInputStream Logo = new FileInputStream("Images/Logo.png");
            //Makes a stage
            Stage window = new Stage();
            //Set's window properties
            window.initModality(Modality.APPLICATION_MODAL);
            window.setTitle("GalaxyOS");
            window.setMinWidth(250);
            //Declare Objects
            Label blankOptionsLabel;
            Button options;
            Label blankQuitLabel;
            Button quit;
            //Initialize Objects
            blankOptionsLabel = new Label();
            options = new Button();
            blankQuitLabel = new Label();
            quit = new Button();
            //Object Propeties
            //Options
            options.setText("Options");
            options.setOnAction(e -> {
                Setting.OpenSettings();
            });
            //Quit
            quit.setText("Quit GalaxyOS");
            quit.setOnAction(e -> {
                window.close();
            });
            //Add Image
            Image logoImage = new Image(Logo);
            //Layout
            ImageView logoLayout = new ImageView(logoImage);
            VBox leftLayout = new VBox();
            leftLayout.getChildren().addAll(blankOptionsLabel, options, blankQuitLabel, quit);
            BorderPane layout = new BorderPane();
            layout.setLeft(leftLayout);
            layout.setRight(logoLayout);
            //Display window
            Scene scene = new Scene(layout, 450, 450);
            window.setScene(scene);
            window.show();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

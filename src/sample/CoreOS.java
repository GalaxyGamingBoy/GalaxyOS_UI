package sample;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.scene.control.Button;

public class CoreOS {

    public static void OS(){
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
        //Quit
        quit.setText("Quit GalaxyOS");
        quit.setOnAction(e->{
            window.close();
        });
        //Layout
        VBox leftLayout = new VBox();
        leftLayout.getChildren().addAll(blankOptionsLabel,options,blankQuitLabel,quit);
        BorderPane layout = new BorderPane();
        layout.setLeft(leftLayout);
        //Display window
        Scene scene = new Scene(layout, 450, 450);
        window.setScene(scene);
        window.show();
    }
}

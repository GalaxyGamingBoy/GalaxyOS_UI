package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.transform.Scale;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Setting {
    public static void OpenSettings(){
        //Makes a window
        Stage window = new Stage();
        //Initialize
        Label title;
        Label changeUsernameLabel;
        TextField changeUsernameField;
        Button changeUsernameChange;
        Button changeUsernameDefault;
        Label changePasswordLabel;
        TextField changePasswordField;
        Button changePasswordChange;
        Button changePasswordDefault;
        Button saveAndExit;
        //Declare Objects
        title = new Label();
        changeUsernameLabel = new Label();
        changeUsernameField = new TextField();
        changeUsernameChange = new Button();
        changeUsernameDefault = new Button();
        changePasswordLabel = new Label();
        changePasswordField = new TextField();
        changePasswordChange = new Button();
        changePasswordDefault = new Button();
        saveAndExit = new Button();
        //Adds function
        title.setText("GalaxyOS Settings");
        changeUsernameLabel.setText("Change Username: ");
        changeUsernameChange.setText("Change");
        changeUsernameDefault.setText("Change to default");
        changeUsernameChange.setOnAction(e->{
            FileManager.WriteUsernameFile(changeUsernameField.getText());
        });
        changeUsernameDefault.setOnAction(e->{
            FileManager.WriteDefaultUsernameFile();
        });
        changePasswordLabel.setText("Change Password: ");
        changePasswordChange.setText("Change");
        changePasswordDefault.setText("Change to default");
        changePasswordChange.setOnAction(e->{
            FileManager.WritePasswordFile(changePasswordField.getText());
        });
        changePasswordDefault.setOnAction(e->{
            FileManager.WriteDefaultPasswordFile();
        });
        saveAndExit.setText("Save and exit");
        saveAndExit.setOnAction(e->{
            window.close();
        });
        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("GalaxyOS Settings");
        window.setMinWidth(250);
        //Layout
        BorderPane bottomLayout = new BorderPane();
        bottomLayout.setRight(saveAndExit);
        HBox changeUsernameLayout = new HBox();
        changeUsernameLayout.getChildren().addAll(changeUsernameLabel, changeUsernameField, changeUsernameChange, changeUsernameDefault);
        HBox changePasswordLayout = new HBox();
        changePasswordLayout.getChildren().addAll(changePasswordLabel,changePasswordField,changePasswordChange,changePasswordDefault);
        VBox centerLayout = new VBox();
        centerLayout.getChildren().addAll(changeUsernameLayout,changePasswordLayout);
        StackPane topLayout = new StackPane();
        topLayout.getChildren().addAll(title);
        BorderPane layout = new BorderPane();
        layout.setTop(topLayout);
        layout.setCenter(centerLayout);
        layout.setBottom(bottomLayout);
        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}

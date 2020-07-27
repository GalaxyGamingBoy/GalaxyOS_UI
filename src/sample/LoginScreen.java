package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;

public class LoginScreen {

    public  static void Login() {
        //Declare Objects
        Button loginButton;
        TextField usernameInput;
        TextField passwordInput;
        Label title;
        Label usernameLabel;
        Label passwordLabel;
        Label statusLabel;
        Label blankLabel;
        Label blankLabell;
        Label blankLabelll;
        Button quit;
        //Makes a stage
        Stage window = new Stage();
        //Initialize Objects
        loginButton = new Button();
        usernameInput = new TextField();
        passwordInput = new TextField();
        title = new Label();
        usernameLabel = new Label();
        passwordLabel = new Label();
        statusLabel = new Label();
        blankLabel = new Label();
        blankLabell = new Label();
        blankLabelll = new Label();
        quit = new Button();
        //Edit Objects
        //title(Label)
        title.setText("Login to GalaxyOS");
        //usernameLabel(Label)
        usernameLabel.setText("Username: ");
        //PasswordLabel(Label)
        passwordLabel.setText("Password: ");
        //loginButton(Button)
        loginButton.setText("Login");
        //statusLabel(Label)
        statusLabel.setText("...");
        //blankLabelll(Label)
        blankLabelll.setText("            ");
        //quit(Button)
        quit.setText("Quit");
        quit.setOnAction(e->{
            window.close();
        });
        //Set's window properties
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("GalaxyOS/Login");
        window.setMinWidth(250);
        //Layout
        //Left Layout
        VBox leftLayout = new VBox();
        leftLayout.getChildren().addAll(usernameLabel, blankLabell, passwordLabel);
        //Center Layout
        VBox centerLayout = new VBox();
        centerLayout.getChildren().addAll(usernameInput, blankLabel, passwordInput);
        //Top Layout
        StackPane topLayout = new StackPane();
        topLayout.getChildren().addAll(title);
        //Bottom layout
        HBox bottomLayout = new HBox();
        bottomLayout.getChildren().addAll(statusLabel,blankLabelll,loginButton,quit);
        //Main layout
        BorderPane layout = new BorderPane();
        layout.setTop(topLayout);
        layout.setBottom(bottomLayout);
        layout.setLeft(leftLayout);
        layout.setCenter(centerLayout);

        //Display window
        Scene scene = new Scene(layout, 500, 135);
        window.setScene(scene);
        window.show();
        //LoginButtonPress
        loginButton.setOnAction(e->{

            try {
                String userInput = usernameInput.getText();
                String username = FileManager.ReadUsernameFiles();
                boolean Check = LoginChecker.UsernameCheck(userInput, username);
                if (Check == false){
                    System.out.println("Access Denied");
                    statusLabel.setText("Access Denied");
                }else{
                    System.out.println("Checked Username");
                    statusLabel.setText("Checked Username");
                    String passUserInput = passwordInput.getText();
                    String password = FileManager.ReadPasswordFiles();
                    boolean passCheck = LoginChecker.PasswordCheck(passUserInput,password);
                    if(passCheck == false){
                        System.out.println("Access Denied");
                        statusLabel.setText("Access Denied");
                    }else {
                        System.out.println("Access Granted");
                        statusLabel.setText("Access Granted");
                        CoreOS.OS();
                        window.close();
                    }
                }
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });

    }
}

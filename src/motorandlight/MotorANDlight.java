/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motorandlight;

/**
 *
 * @author Tlotlanang
 */


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 

public class MotorANDlight extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        
        primaryStage.setTitle("Motor and Light Controller");
        primaryStage.setScene(new Scene(root));
        String css = this.getClass().getResource("main.css").toExternalForm();
        root.getStylesheets().add(css);
        primaryStage.show();
        }catch(IOException e){
            System.out.println("Failed to load FXML!");
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}

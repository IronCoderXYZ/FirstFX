/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstfx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author mitch
 */
public class FirstFx extends Application {
    
    private Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.show();
        mainWindow();
    }
    
    public void mainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(FirstFx.class.getResource("MainWindowView.fxml"));
            AnchorPane pane = loader.load();
            
            MainWindowController mainWindowController = loader.getController();
            
            Scene scene = new Scene(pane);
            
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException ex) {
           // Todo
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

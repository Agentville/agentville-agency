package de.agentville.agency.gui;

/*
 * Vollständige Traybar-Lösung:
 * https://gist.github.com/jewelsea/e231e89e8d36ef4e5d8a
 * 
 * Auch interessant:
 * https://stackoverflow.com/questions/12571329/javafx-app-in-system-tray/12571924#12571924
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class TrayBarPopUpFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
//            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);

 Scene scene = new Scene(root, 400, 600);

        primaryStage.setTitle("Agency");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 }
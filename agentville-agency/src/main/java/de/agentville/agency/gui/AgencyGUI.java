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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;

 
public class AgencyGUI extends Application {
    
	@Override
    public void start(Stage stage) {
		
		stage.setTitle("Agentville Agency Vers. 0.0.1");

		final ViewTuple<AgencyView, AgencyViewModel> viewTuple = FluentViewLoader.javaView(AgencyView.class).load();

		final Parent root = viewTuple.getView();
		stage.setScene(new Scene(root));
		stage.show();
		
    	
//        Button btn = new Button();
//        btn.setText("Open TrayBar-Window");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//        	 
//  //          @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//
//        Scene scene = new Scene(root, 800, 600);
//
//        primaryStage.setTitle("Agentville Agency Vers. 0.0.1");
//        primaryStage.setScene(scene);        
//        primaryStage.show();
        
    }
    
 }
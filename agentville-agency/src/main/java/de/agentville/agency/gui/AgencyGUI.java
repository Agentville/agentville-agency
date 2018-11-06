package de.agentville.agency.gui;

/*
 * mvvm mit mvvmfx:
 * https://github.com/sialcasa/mvvmFX/blob/develop/examples/mini-examples/helloworld-without-fxml/src/main/java/de/saxsys/mvvmfx/examples/helloworld/HelloWorldView.java
 * 
 * oder für oberflächen mit FXML (JavaFX SceneBuilder):
 * https://github.com/sialcasa/mvvmFX/wiki/Getting-Started-HelloWorld-(deutsch)
 * 
 * 
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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;

 
public class AgencyGUI extends Application {
    
	@Override
    public void start(Stage stage) {
		
		stage.setTitle("Agentville Agency Vers. 0.0.1");
		
//        // Create MenuBar
//        MenuBar menuBar = new MenuBar();
//        
//        // Create menus
//        Menu fileMenu = new Menu("File");
//        Menu editMenu = new Menu("Edit");
//        Menu helpMenu = new Menu("Help");
//        
//        // Create MenuItems
//        MenuItem newItem = new MenuItem("New");
//        MenuItem openFileItem = new MenuItem("Open File");
//        MenuItem exitItem = new MenuItem("Exit");
//        
//        MenuItem copyItem = new MenuItem("Copy");
//        MenuItem pasteItem = new MenuItem("Paste");
//        
//        // Add menuItems to the Menus
//        fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
//        editMenu.getItems().addAll(copyItem, pasteItem);
//        
//        // Add Menus to the MenuBar
//        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
//        
////        BorderPane root = new BorderPane();
////        root.setTop(menuBar);
////        Scene scene = new Scene(root, 350, 200);
//
//		
//		
		
		final ViewTuple<AgencyView, AgencyViewModel> viewTuple = FluentViewLoader.javaView(AgencyView.class).load();

		final Parent root = viewTuple.getView();
		
//        root.setTop(menuBar);
		
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
package de.agentville.agency.gui;

import java.net.URL;
import java.util.ResourceBundle;

import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class MenuBarView extends HBox implements JavaView<MenuBarViewModel>, Initializable {
//public class MenuBarView extends VBox implements JavaView<MenuBarViewModel>, Initializable {
	
	@InjectViewModel
	private MenuBarViewModel viewModel;
	
	private final Label helloLabel = new Label();
	
	private final MenuBar menuBar = new MenuBar();

	public MenuBarView() {
		
	    // --- Menu File
	    Menu menuFile = new Menu("File");

	    // --- Menu Edit
	    Menu menuEdit = new Menu("Edit");

	    // --- Menu View
	    Menu menuView = new Menu("View");

	    menuBar.getMenus().addAll(menuFile, menuEdit, menuView);

	    getChildren().add(menuBar);
		//setPadding(new Insets(0));
					
	
//	    Scene scene = new Scene(new VBox(), 400, 350);
//	    scene.setFill(Color.OLDLACE);
//
//	    MenuBar menuBar = new MenuBar();
//
//
//
//	    ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
//
//	    //stage.setScene(scene);
	}
	
//	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		helloLabel.textProperty().bind(viewModel.helloMessage());
	}
}

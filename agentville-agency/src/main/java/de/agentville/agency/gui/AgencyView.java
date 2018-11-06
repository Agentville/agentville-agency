package de.agentville.agency.gui;

import java.net.URL;
import java.util.ResourceBundle;

import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

//public class AgencyView extends BorderPane implements JavaView<AgencyViewModel>, Initializable {
public class AgencyView extends VBox implements JavaView<AgencyViewModel>, Initializable {

	private final Label helloLabel = new Label();

	@InjectViewModel
	private AgencyViewModel viewModel;

	public AgencyView() {
		
//        MenuBar menuBar = new MenuBar();
//        
//        // --- Menu File
//        Menu menuFile = new Menu("File");
// 
//        // --- Menu Edit
//        Menu menuEdit = new Menu("Edit");
// 
//        // --- Menu View
//        Menu menuView = new Menu("View");
// 
//        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
//		
////        ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
//        getChildren().addAll(menuBar);
		
		getChildren().add(helloLabel);
		setPadding(new Insets(10, 10, 600, 800));
	}

//	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		helloLabel.textProperty().bind(viewModel.helloMessage());
	}

}
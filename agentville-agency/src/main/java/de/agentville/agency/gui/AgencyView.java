package de.agentville.agency.gui;

import java.net.URL;
import java.util.ResourceBundle;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;
import de.saxsys.mvvmfx.ViewTuple;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class AgencyView extends BorderPane implements JavaView<AgencyViewModel>, Initializable {
//public class AgencyView extends VBox implements JavaView<AgencyViewModel>, Initializable {

	private final Label helloLabel = new Label();
	private final Label leftLabel = new Label();
	private final Label rightLabel = new Label();
	private final Label centerLabel = new Label();
	
	@InjectViewModel
	private AgencyViewModel viewModel;

	public AgencyView() {
		
		final ViewTuple<MenuBarView, MenuBarViewModel> menuBarViewTuple = FluentViewLoader.javaView(MenuBarView.class).load();
		final Parent menuBar = menuBarViewTuple.getView();

		this.setTop(menuBar);
		this.setBottom(helloLabel);
		this.setCenter(leftLabel);
		this.setRight(rightLabel);
		this.setLeft(centerLabel);
		//this.setAlignment(menuBar, Pos.TOP_LEFT);
//		((BorderPane) getChildren()).setTop(menuBar);
		//getChildren().add(menuBar);
		//setPadding(new Insets(0, 0, 600, 800));
	}

//	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		helloLabel.textProperty().bind(viewModel.helloMessage());
		leftLabel.textProperty().bind(viewModel.helloMessage());
		rightLabel.textProperty().bind(viewModel.helloMessage());
		centerLabel.textProperty().bind(viewModel.helloMessage());
	}
	
	
	
//	BorderPane border = new BorderPane();
//	HBox hbox = addHBox()
//	border.setTop(hbox);
//	border.setLeft(addVBox());
//	addStackPane(hbox);         // Add stack to HBox in top region
//
//	border.setCenter(addGridPane());
//	border.setRight(addFlowPane());
//	border.setBottom(node);
	

}
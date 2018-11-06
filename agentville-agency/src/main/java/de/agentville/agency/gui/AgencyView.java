package de.agentville.agency.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;

public class AgencyView extends VBox implements JavaView<AgencyViewModel>, Initializable {

	private final Label helloLabel = new Label();

	@InjectViewModel
	private AgencyViewModel viewModel;

	public AgencyView() {
		getChildren().add(helloLabel);
		setPadding(new Insets(10, 10, 600, 800));
	}

//	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		helloLabel.textProperty().bind(viewModel.helloMessage());
	}

}
package de.agentville.agency.gui;

import de.saxsys.mvvmfx.ViewModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AgencyViewModel implements ViewModel {

	private final StringProperty helloMessage = new SimpleStringProperty("hi!");

	public StringProperty helloMessage() {
		return helloMessage;
	}

	public String getHelloMessage() {
		return helloMessage.get();
	}

	public void setHelloMessage(String message) {
		helloMessage.set(message);
	}

}

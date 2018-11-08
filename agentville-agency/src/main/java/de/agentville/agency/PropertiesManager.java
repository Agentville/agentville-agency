package de.agentville.agency;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PropertiesManager {
	
	private static final Logger logger = LogManager.getLogger(PropertiesManager.class);
	
	String appDir = System.getProperty("user.dir");
	String propFileName = "/agency.properties";
	
	Properties prop = new Properties();
	OutputStream output = null;
	InputStream input = null;

	
	public PropertiesManager() {
		
		initProperties();
		
		readProperties();
		
	}
	
	private void initProperties() {
		
		logger.trace("user.dir: " + System.getProperty("user.dir"));
		logger.trace("user.home: " + System.getProperty("user.home"));
		logger.trace("java.io.tmpdir: " + System.getProperty("java.io.tmpdir"));
		logger.trace("basedir: " + System.getProperties().get("basedir"));
		
		//System.getProperties().list( System.out );	//gibt alle system-properties aus.
//		java.io.tmpdir=C:\Users\mstef\AppData\Local\Temp\
//		user.dir=D:\Git-Projekte\agentville-agency\age...
		
		prop.setProperty("app.view.fullSize",  "true");

		prop.setProperty("app.settings.minimizeToTray", "false");
		prop.setProperty("app.view.dimensions.width", "200");
		prop.setProperty("app.view.dimensions.height", "300");
		prop.setProperty("app.view.placement.horizontal", "");
		prop.setProperty("app.view.placement.vertical", "");
		
	}
	
	private void readProperties() {
		
		logger.trace("read properties");
		
		try {

			input = new FileInputStream(appDir + propFileName);

			prop.load(input);
			
			// get the property value and print it out
			prop.list(System.out);				

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			createPropertiesFile();	
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	private void writeProperties() {
		
	}
	
	private void createPropertiesFile() {
		
		logger.trace("createProperties");

		try {

			output = new FileOutputStream(appDir + propFileName);
	
			// save properties to project root folder
			prop.store(output, null);
			
			logger.trace("Datei erzeugt?");

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
	public String getPropertie(String propName) {
		
		String propValue = null;
		
		propValue = prop.getProperty(propName);
		
		return propValue;
	}
	
	public void addPropertie(String propName, String propValue) {
		
	}
	
	public void removePropertie(String propName) {
		
	}
	
}
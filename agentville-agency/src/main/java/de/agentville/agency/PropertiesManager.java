package de.agentville.agency;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesManager {
	
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
		
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("java.io.tmpdir"));
		System.out.println(System.getProperties().get("basedir"));
		
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
		
		System.out.println("read properties");
		
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
		
		System.out.println("createProperties");

		try {

			output = new FileOutputStream(appDir + propFileName);
	
			// save properties to project root folder
			prop.store(output, null);
			
			System.out.println("DAtei erzeugt?");

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
	
}
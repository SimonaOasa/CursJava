package curs14;

import java.util.Properties;

import java.io.*; 

public class TestPropertiesFile {

	public static void main(String[] args) {
		
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		
		obj.writePropertiesFile();

		obj.readPropertiesFile("hostname");
		obj.readPropertiesFile("email");
		obj.readPropertiesFile("user");
		obj.readPropertiesFile("url");
		
		System.out.println("---");
		
		obj.updatePropertiesFile("user","Oana");
		obj.readPropertiesFile("user");
		
		obj.deleteFromPropertiesFile("user");
	}

}



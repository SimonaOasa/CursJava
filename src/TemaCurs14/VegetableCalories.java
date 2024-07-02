package TemaCurs14;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class VegetableCalories {

	public static void main(String[] args) {
		
				
		//scriu legumele in fisierul de proprietati
		
		writePropertiesFile();
		
		//Scanner pt input utilizator
		Scanner scanner = new Scanner(System.in);
		String vegetable; 

		while (true) {
			System.out.println("Introdu numele legumei pe care vrei sa o cumperi:");
			vegetable = scanner.nextLine().toLowerCase();
			
			String calories = readPropertiesFile(vegetable);
			
			if (calories != null) {
				System.out.println("Leguma aleasa de tine are " + calories + " calorii.");
				break;
			} else {
				System.out.println("Nu vindem aceasta leguma. Te rugam sa alegi alta");
			}
			
		}
		
		scanner.close();
		
	}
		
		//scriere in fisierul de proprietati
		private static void writePropertiesFile() {
			
			Properties properties = new Properties();
			
			properties.setProperty("morcov", "58");
			properties.setProperty("rosie", "18");
			properties.setProperty("castravete", "16");
			properties.setProperty("ardei", "20");
			properties.setProperty("varza", "25");
		

			try (OutputStream output = new FileOutputStream("vegetables.properties")) {
				 properties.store(output, null);
			} catch (IOException io) {
				io.printStackTrace();
			}
			
		}
		
		//citire din fisierul de proprietati 
		private static String readPropertiesFile(String vegetable) {
			
			Properties properties = new Properties();
			
			try (InputStream input = new FileInputStream("vegetables.properties")) {
				properties.load(input);
				return properties.getProperty(vegetable);
				
			} catch (IOException io) {
				io.printStackTrace();
				return null;
			}
			
		}
		
	}



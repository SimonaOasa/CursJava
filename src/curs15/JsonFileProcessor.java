package curs15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/*
 * 
 * [{  name = "ion",
 * 	  email = "ion@ion.com"
 *  },
 *  {  name = "ion",
 * 	  email = {
 * 				homeEmail = "ceva",
 * 				workemail = [{}, {}]
 *              }
 *  }
 *  ]
 * 
 */

public class JsonFileProcessor {

	@SuppressWarnings("unchecked")
	public void writeJsonFile() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "Oana");
		obj.put("email", "oana@oana.net");
		
		try(FileWriter file = new FileWriter("test.json")){
			
			file.write(obj.toJSONString());
			
		}catch(IOException e) {
			System.out.println("Nu am putut scrie fisierul");
		}
		
		
	}
	
	
	public void readJsonFile(String key) {
		
		try(FileReader file =  new FileReader("test.json")){
			JSONParser parser =  new JSONParser();
			JSONObject jsonObj =  (JSONObject) parser.parse(file);
			
			String value = (String) jsonObj.get(key);
			System.out.println(value);
			
		}catch(Exception e) {
			System.out.println("NU am putut citi fisierul");
		}
	}
	
	public void readJsonFile2(String key) {
		
		try(FileReader file =  new FileReader("data.json")){
			JSONParser parser =  new JSONParser();
			Object obiect = parser.parse(file);
			JSONArray obiectPrimar = (JSONArray) obiect;
			System.out.println(obiectPrimar);
			JSONObject jsonObject = (JSONObject) obiectPrimar.get(0);
			System.out.println(jsonObject);
			JSONObject timestamp = (JSONObject) jsonObject.get("timestamp");
			System.out.println(timestamp);
			String user =  (String) timestamp.get("user");
			System.out.println(user);
			System.out.println("------------------------------");
			JSONObject jsonObject2 = (JSONObject) obiectPrimar.get(1);
			System.out.println(jsonObject2);
			JSONObject timestamp2 = (JSONObject) jsonObject2.get("timestamp2");
			System.out.println(timestamp2);
			timestamp2.remove("user2");
			
			try(FileWriter writer =  new FileWriter("data.json")){
				writer.write(jsonObject2.toJSONString());
			}
			
		}catch(Exception e) {
			System.out.println("NU am putut citi fisierul");
		}
	}
	
	@SuppressWarnings("unchecked")
	public void updateJsonFile(String key, String value) {
		
		try(FileReader reader = new FileReader("test.json")){
			JSONParser parser =  new JSONParser();
			JSONObject jsonObj =  (JSONObject) parser.parse(reader);
			
			jsonObj.put(key, value);
			
			try(FileWriter writer =  new FileWriter("test.json")){
				writer.write(jsonObj.toJSONString());
			}
			
		}catch(Exception e) {
			System.out.println("A aparut o eroare");
		}	
	}
	
	public void deleteFromJsonFile(String key) {
		try(FileReader reader = new FileReader("test.json")){
			JSONParser parser =  new JSONParser();
			JSONObject jsonObj =  (JSONObject) parser.parse(reader);
			
			jsonObj.remove(key);
			
			try(FileWriter writer =  new FileWriter("test.json")){
				writer.write(jsonObj.toJSONString());
			}
			
		}catch(Exception e) {
			System.out.println("A aparut o eroare");
		}	
	}
	
	
	
}

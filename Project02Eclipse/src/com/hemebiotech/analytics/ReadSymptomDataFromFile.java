package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadSymptomDataFromFile  {
	
  public List<String> GetSymptoms(String path) throws IOException {
  
          List <String> symptoms = new ArrayList<>();
	
	        	 
		// first get input
          
          // creating a reader object (BufferedReader)/ Buffering the symptoms.txt file
	        	 
		BufferedReader reader = new BufferedReader (new FileReader(path));
		String line = reader.readLine(); //reading line by line
		
		//Loop while- reading symptoms /storing values in memory
		while (line != null) {
			
			symptoms.add(line);

			line = reader.readLine();	// get another symptom
		}
		
		reader.close();
		return symptoms;
	}

}

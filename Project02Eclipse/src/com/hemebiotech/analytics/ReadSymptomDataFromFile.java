package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * this class contain a method to read the file
 * @author rania
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {
	
  /**
   * this method read a file
   * @param path (the path to the file)
   * @return a list of symptoms
   * @throws IOException
   */
	@Override
public List<String> GetSymptoms(String path) throws IOException { //an exception can be throws if there is any error to read or write the file
  
          List <String> symptoms = new ArrayList<>(); // creating a list to stock the symptoms
	
	        	 
		// first get input
          
          // creating a reader object (BufferedReader)/ Buffering the symptoms.txt file
	        	 
		BufferedReader reader = new BufferedReader (new FileReader(path));
		String line = reader.readLine(); //reading line by line
		
		//Loop while- reading symptoms /storing values in memory
		while (line != null) {
			
			symptoms.add(line);

			line = reader.readLine();	// get another symptom
		}
		
		reader.close(); // closing the reader
		return symptoms; // return list of the symptoms
	}

}

package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

/**
 * @author rania
 *
 */
public class Counting {
 
	/**
	 * This method call the method for reading the file, then count and return a TreeMap
	 * @return a TreeMap because the data are sorted alphabetically in output
	 * @throws IOException
	 */
	public TreeMap<String,Integer> count() throws IOException{
		
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
		List <String> symptoms = reader.GetSymptoms ("Project02Eclipse/symptoms.txt"); // call the method that read the symptoms from the file
		
		TreeMap<String, Integer> counter = new TreeMap<>(); // creating a map 
		for ( String symptom : symptoms){
			Integer currentCount= counter.get(symptom); 
			
			if(currentCount != null) {
				currentCount++;       // if the counter exists we increment
				counter.put(symptom, currentCount);
			}else {
				counter.put(symptom, 1);  //if it does not exist we put 1 as value in the map
			}
		}
		
		return counter;
		
	}
}

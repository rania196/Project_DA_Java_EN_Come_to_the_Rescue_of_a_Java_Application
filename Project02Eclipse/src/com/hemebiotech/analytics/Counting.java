package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class Counting {
 
	public TreeMap<String,Integer> count() throws IOException{
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile();
		List <String> symptoms = reader.GetSymptoms ("Project02Eclipse/symptoms.txt"); //Lecture des symptômes depuis le fichier
		TreeMap<String, Integer> counter = new TreeMap<>();
		for ( String symptom : symptoms){
			Integer currentCount= counter.get(symptom);
			
			if(currentCount != null) {
				currentCount++;
				counter.put(symptom, currentCount);
			}else {
				counter.put(symptom, 1);
			}
		}
		
		return counter;
		
	}
}

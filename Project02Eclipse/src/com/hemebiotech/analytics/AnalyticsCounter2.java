package com.hemebiotech.analytics;
      
import java.io.IOException;
import java.util.List;
import java.util.Map;

 
public class AnalyticsCounter2 {
		
	
	/**
	 * This class is the main that call all the methods
	 * @param args
	 * @throws Exception
	 */
	
	public static void main(String args[]) throws Exception {
	
		
		
		 WriteSymptomDataToFile writer = new WriteSymptomDataToFile();
		
		 
		try {
		writer.WriteSymptoms(); // Ecriture des sympt�mes dans le fichier result.out
		System.out.println("Tout s'est bien pass�!");
		}
		catch (IOException e) {
			System.out.println("Une erreur est survenue !");
		}
		
	}
}

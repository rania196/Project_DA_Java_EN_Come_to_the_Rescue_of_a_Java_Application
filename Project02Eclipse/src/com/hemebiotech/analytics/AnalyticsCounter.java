package com.hemebiotech.analytics;
      
import java.io.IOException;

 
public class AnalyticsCounter {
		
	
	/**
	 * This class is the main that call all the methods
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
	
		
		
		 WriteSymptomDataToFile writer = new WriteSymptomDataToFile();
		
		 
		try {
		writer.WriteSymptoms(); // Ecriture des symptômes dans le fichier result.out
		System.out.println("Tout s'est bien passé!");
		}
		catch (IOException e) {
			System.out.println("Une erreur est survenue !");
		}
		
	}
}

package com.hemebiotech.analytics;
      
import java.io.IOException;

 
/**
 * This class is the main that call all the methods
 * @author rania
 *
 */
public class AnalyticsCounter {
		
	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
	
		
		
		 WriteSymptomDataToFile writer = new WriteSymptomDataToFile();
		
		 
		try { // try this if everything is good
		writer.WriteSymptoms(); // call the method that write symptoms in the file result.out
		System.out.println("Tout s'est bien passé!");
		}
		catch (IOException e) { 
			System.out.println("Une erreur est survenue !");
		}
		
	}
}

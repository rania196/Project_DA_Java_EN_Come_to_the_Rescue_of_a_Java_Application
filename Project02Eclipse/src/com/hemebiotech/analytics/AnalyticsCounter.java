package com.hemebiotech.analytics;
      
import java.io.IOException;

 
/**
 * This class is the main that call all the methods
 * @author rania
 *
 */
public class AnalyticsCounter {
		
	
	/**
	 * @param args list of arguments
	 * @throws Exception - an exception can be raised if there is a read or write error in the file 
	 */
	public static void main(String args[]) throws Exception {
	
		
		
		 WriteSymptomDataToFile writer = new WriteSymptomDataToFile();
		
		 
		try {
		writer.WriteSymptoms(); 
		System.out.println("Tout s'est bien passé!");
		}
		catch (IOException e) { 
			System.out.println("Une erreur est survenue !");
		}
		
	}
}

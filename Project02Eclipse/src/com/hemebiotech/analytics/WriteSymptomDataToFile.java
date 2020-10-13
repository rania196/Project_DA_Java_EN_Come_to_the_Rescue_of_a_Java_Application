package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

/**
 * this class contain a method that write the result on the file 
 * @author rania
 *
 */
public class WriteSymptomDataToFile {
	
	
	/**
	 * this method write symptoms in the file result.out, also for calls the method that is already created for the count
	 * generate output
	 * @param symptoms
	 * @throws IOException
	 */
	public void WriteSymptoms() throws IOException {
		Counting counter = new Counting();
		Map<String,Integer> counters = counter.count();                     //call the method that count
		FileWriter writer = new FileWriter ("result.out");                 // opening the file in writing
		for(Entry<String, Integer> count: counters.entrySet()) {          // the method entrySet allows to convert the map into a list to be able to loop over it
			writer.write( count.getKey() +":"+ count.getValue() + "\n"); //for each symptom write the name and the number of occurrences
		}
		writer.close();                                         // closing
	}

}

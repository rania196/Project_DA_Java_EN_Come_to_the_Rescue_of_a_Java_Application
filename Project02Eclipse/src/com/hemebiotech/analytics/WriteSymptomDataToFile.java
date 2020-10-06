package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author rania
 *
 */
public class WriteSymptomDataToFile {
	
	//generate output
	/**
	 * @param symptoms
	 * @throws IOException
	 */
	public void WriteSymptoms() throws IOException {
		Counting counter = new Counting();
		Map<String,Integer> counters = counter.count();
		FileWriter writer = new FileWriter ("result.out");
		for(Entry<String, Integer> count: counters.entrySet()) {
			writer.write( count.getKey() +":"+ count.getValue() + "\n");
		}
		writer.close();
	}

}

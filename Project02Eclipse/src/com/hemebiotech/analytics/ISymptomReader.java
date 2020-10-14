package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public interface ISymptomReader {

	/**
	 * Reads a file and returns a list of symptoms
	 * @param path, the path to the file
	 * @return a list of symptoms
	 * @throws IOException Input or Output Exceptions
	 */
	List<String> GetSymptoms(String path) throws IOException;
}

package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public interface ISymptomReader {

	/**
	 * Read a file and returns a list of symptoms
	 * @param path
	 * @return
	 * @throws IOException
	 */
	List<String> GetSymptoms(String path) throws IOException;
}

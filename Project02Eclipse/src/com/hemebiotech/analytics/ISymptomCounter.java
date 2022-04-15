package analytics;

import java.io.*;
import java.util.*;


public interface ISymptomCounter {
	/**
	 * 
	 * @return a Tree Map of the symptoms (key) and their counts (value)
	 * @throws IOException
	 */
	TreeMap<String, Integer> CountSymptoms () throws IOException;
}

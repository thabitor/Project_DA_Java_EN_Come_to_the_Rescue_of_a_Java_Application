package analytics;

import java.io.*;
import java.util.*;

/**
 * Simple brute force implementation
 *
 */
public class WriteData implements ISymptomWriter {

	private TreeMap<String, Integer> counterResult;
 

	public WriteData (TreeMap<String, Integer> counterResult) {
	this.counterResult = counterResult;
	}

	/**
	 * 
	 * comments to be added
	 */
@Override
	public void WriteSymptoms() throws IOException {
		FileWriter writer = new FileWriter ("analytics/results.out");
	try {for (Map.Entry<String, Integer> key : counterResult.entrySet()){
		 if (key.getValue() == 1) {
						writer.write(key.getKey().substring(0, 1).toUpperCase() + key.getKey().substring(1) + " occurs " + key.getValue() + " time.\n"); 
				} else {
						writer.write(key.getKey().substring(0, 1).toUpperCase() + key.getKey().substring(1) + " occurs " + key.getValue() + " times.\n");
					} writer.flush();  
				} writer.close(); 
	} catch (IOException e) {
				} 
			}
		}


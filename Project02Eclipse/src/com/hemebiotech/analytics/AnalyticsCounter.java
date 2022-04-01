package com.hemebiotech.analytics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
		String eachLine = reader.readLine();

		 List<String> symptomsDotText = new ArrayList<String>();

		while ((eachLine = reader.readLine()) != null) {
			symptomsDotText.add(eachLine);
			symptomsDotText.sort(String::compareToIgnoreCase);
		}

		reader.close();

		String[] symptomsDotTxtToArray = new String [symptomsDotText.size()];
		symptomsDotText.toArray(symptomsDotTxtToArray);
	//	System.out.println(Arrays.toString(symptomsDotTxtToArray));

		FileWriter writer = new FileWriter ("result.out", true);
		int i = 0;

		while (i<symptomsDotTxtToArray.length) {
			int symptom = i;
			while (i<symptomsDotTxtToArray.length && symptomsDotTxtToArray[i].equals(symptomsDotTxtToArray[symptom])) {
				i++;
			}
			int count = i - symptom;
			String symptomFrequency = symptomsDotTxtToArray[symptom].toString() + " : " + Integer.toString(count);
			symptomFrequency = symptomFrequency.substring(0,1).toUpperCase() + symptomFrequency.substring(1).toLowerCase();
			System.out.println(symptomFrequency);
			writer.write(symptomFrequency + "\n");
		}
		writer.close();
	}
}
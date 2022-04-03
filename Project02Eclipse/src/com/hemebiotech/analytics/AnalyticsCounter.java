package com.hemebiotech.analytics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));  // reads from original text file
		String eachLine = reader.readLine();   //reads each line of the text file
		List<String> symptomsDotText = new ArrayList<String>();  // new arraylist from the file
		while ((eachLine = reader.readLine()) != null) {  // while loop to add each line of text file to the new arraylist
			symptomsDotText.add(eachLine);
			symptomsDotText.sort(String::compareToIgnoreCase); // sorting elements of arraylist (symptoms) alphabetically
		} reader.close();
		String[] symptomsDotTxtToArray = new String [symptomsDotText.size()];  // converting ArrayList to Array
		symptomsDotText.toArray(symptomsDotTxtToArray);
		//	System.out.println(Arrays.toString(symptomsDotTxtToArray));
		FileWriter writer = new FileWriter ("result.out", true);      // introducing filewriter class for later file output using the append option
		int i = 0;
		while (i<symptomsDotTxtToArray.length) {  // double while loop to reiterate through elements of the array and count occurences
			int symptom = i;
			while (i<symptomsDotTxtToArray.length && symptomsDotTxtToArray[i].equals(symptomsDotTxtToArray[symptom])) {i++;}
			// writing output of the program and to the output.txt
			int count = i - symptom;
			String symptomFrequency = symptomsDotTxtToArray[symptom].toString() + " : " + Integer.toString(count);
			symptomFrequency = symptomFrequency.substring(0,1).toUpperCase() + symptomFrequency.substring(1).toLowerCase();
			System.out.println(symptomFrequency);
			writer.write(symptomFrequency + "\n");
		} writer.close();
	}
}
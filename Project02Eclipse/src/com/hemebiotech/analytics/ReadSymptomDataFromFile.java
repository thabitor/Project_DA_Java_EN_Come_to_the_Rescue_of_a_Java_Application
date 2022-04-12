package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

  public List<String> GetSymptoms() {

BufferedReader reader = new BufferedReader (new FileReader("/home/thabit/Documents/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));  
    String eachLine = new String();   //Reads each line of the text file
		ArrayList<String> symptomsDotText = new ArrayList<String>();  //Creating new ArrayList for containing lines from the file as elements
		while ((eachLine = reader.readLine()) != null) {  //While loop to add each line of text file to the new ArrayList
			symptomsDotText.add(eachLine);
		Collections.sort(symptomsDotText); 
		} reader.close();
}
}

package com.hemebiotech.analytics;
import java.io.*;
import java.util.*;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {

// 1) Getting input from the original text file using BufferedReader class
	
    BufferedReader reader = new BufferedReader (new FileReader("/home/thabit/Documents/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));  
    String eachLine = new String();   //Reads each line of the text file
		ArrayList<String> symptomsDotText = new ArrayList<String>();  //Creating new ArrayList for containing lines from the file as elements
		while ((eachLine = reader.readLine()) != null) {  //While loop to add each line of text file to the new ArrayList
			symptomsDotText.add(eachLine);
		Collections.sort(symptomsDotText); 
		} reader.close();
 
// 2) Introduce BufferedWriter class for later file output using the append option
    
    BufferedWriter writer = new BufferedWriter (new FileWriter("/home/thabit/Documents/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/results.out", true));    
    
// 3) Introduce nested while loop to reiterate through the elements of the Array and count occurences of each
    
     int lengthOfEachElement = 0;
     while (lengthOfEachElement < symptomsDotText.size()) { 			int indexElement = lengthOfEachElement;
	   while (lengthOfEachElement < symptomsDotText.size() && symptomsDotText.get(lengthOfEachElement).equals(symptomsDotText.get(indexElement))) {lengthOfEachElement++;}
		
     //count = length position - index position
     int count = lengthOfEachElement - indexElement; 
      		 
// 4) Writing output of the program and to the results.out
         
      String symptomFrequency = symptomsDotText.get(indexElement).toString() + " : " + Integer.toString(count);
		  symptomFrequency = symptomFrequency.substring(0,1).toUpperCase() + symptomFrequency.substring(1).toLowerCase();
	   	System.out.println(symptomFrequency);
      writer.write(symptomFrequency + "\n");
		} 
   writer.write("\n" + "+++End of Output+++" + "\n\n");
   writer.close();
  }
}

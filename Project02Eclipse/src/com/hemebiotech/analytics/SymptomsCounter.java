package analytics;

import java.util.*;
import java.io.*;


public class SymptomsCounter {

  static ArrayList<String> symptomsArray = ReaderToArray.symptomsArray;
  static String symptomFrequency;

  public static void symptomCounterWriter(ArrayList<String> symptomsArray) throws IOException {
      
      symptomsArray = symptomsArray;
      BufferedWriter writer = new BufferedWriter (new FileWriter("analytics/results.out", true));

    //Counter

      int positionElement = 0;
           while (positionElement < symptomsArray.size()) { int indexElement = positionElement;
         	 while (positionElement < symptomsArray.size() && symptomsArray.get(positionElement).equals(symptomsArray.get(indexElement))) {positionElement++;}
		
    // count = length position - index position
    int count = positionElement - indexElement;
      		 
    //Writer
         
    symptomFrequency = symptomsArray.get(indexElement).toString() + " : " + Integer.toString(count);
		 symptomFrequency = symptomFrequency.substring(0,1).toUpperCase() + symptomFrequency.substring(1).toLowerCase();
	    writer.write(symptomFrequency + "\n");
       System.out.println(symptomFrequency);
		} 
      writer.write("\n" + "+++End of Output+++" + "\n\n");
   writer.close();
 }
}
 


 


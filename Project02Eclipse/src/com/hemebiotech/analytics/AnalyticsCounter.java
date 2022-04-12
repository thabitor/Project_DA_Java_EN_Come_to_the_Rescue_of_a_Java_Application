package analytics;
import java.io.*;
import java.util.*;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {


    // 1) Getting input from the original text file and adding it to an ArrayList
    // ReaderToArray class + method

    ReaderToArray readerToArray = new ReaderToArray();
    readerToArray.symptomReader("analytics/symptoms.txt");
    System.out.println(readerToArray.symptomsArray.toString());

   // 2) Iterating through the ArrayList, counting and outputting frequency of each symptom to screen and output file 
   // SymptomsCounter class + method

    SymptomsCounter.symptomCounterWriter(readerToArray.symptomsArray);   
  } 
}


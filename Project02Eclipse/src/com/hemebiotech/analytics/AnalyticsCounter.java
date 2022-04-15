package analytics;

import java.io.*;
import java.util.*;

public class AnalyticsCounter {

    /* This class and its main method act is the controler of all the methods in this application
    *
    */

    List<String> symptomsArray;
    TreeMap <String, Integer> symptomsTreeMap;

    public static void main(String[] args) throws IOException {

        AnalyticsCounter symptomsAnalyticsCounter = new AnalyticsCounter();
        symptomsAnalyticsCounter.ReadSymptoms();
        symptomsAnalyticsCounter.CountSymptoms();
        symptomsAnalyticsCounter.WriteSymptoms();
    }


    public void ReadSymptoms() {

        ReadData readerFromFile = new ReadData("analytics/symptoms.txt");
        symptomsArray = readerFromFile.ReadSymptoms();
    }
	
	public void CountSymptoms() throws IOException {
        
        CountData listConverter = new CountData(symptomsArray);
        symptomsTreeMap = listConverter.CountSymptoms();
        System.out.println(symptomsTreeMap); 
    }
        
     public void WriteSymptoms() throws IOException {

        WriteData writerToFile = new WriteData(symptomsTreeMap);
        writerToFile.WriteSymptoms();
     }
	
}
<<<<<<< HEAD
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

=======
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
>>>>>>> 531d7153f144f75ae1117c0e99aa6c14eb2d9add

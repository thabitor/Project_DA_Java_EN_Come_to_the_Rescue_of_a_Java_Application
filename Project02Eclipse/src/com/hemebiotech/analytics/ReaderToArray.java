package analytics;
import java.io.*;
import java.util.*;

  public class ReaderToArray {

  static String filePath;
  static ArrayList<String> symptomsArray;
    
    public static ArrayList<String> symptomReader(String filePath) throws IOException {
      symptomsArray = new ArrayList<String>();
      try {
BufferedReader reader = new BufferedReader (new FileReader(filePath));
String eachLine = "";
while ((eachLine = reader.readLine()) != null)
     {symptomsArray.add(eachLine);}
    } catch (IOException e) {
e.printStackTrace();
     } Collections.sort(symptomsArray); 
   return symptomsArray;
    }
  } 



package com.hemebiotech.analytics;
<<<<<<< HEAD

import java.io.*;
import java.util.*;

public class AnalyticsCounter {
<<<<<<< HEAD
//	private static int headCount = 0;    // initialize to 0
//	private static int rashCount = 0;        // initialize to 0
//	private static int pupilCount = 0;        // initialize to 0

	public static void main(String args[]) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
	//	FileWriter writer = new FileWriter ("result.out");

		List<String> originalSymptomsFile = new ArrayList<String>();

		String singleLine;    // this temporary variable refers to each line of the original text file
		while ((singleLine = reader.readLine()) != null) {
			originalSymptomsFile.add(singleLine);
		}
			reader.close();  // make sure this closing line is outside the while loop scope

		originalSymptomsFile.sort(String::compareToIgnoreCase);

		ArrayList<String> uniqueSymptoms = new ArrayList<String>();

	/*	for (String symptom : originalSymptomsFile) {
			//'element' refers to each element of the uniqueSymptoms array; this statement says 'for each element in uniqueSymptoms reiterate through the originalSymptomsFile array and check the following condition/action
			if (!uniqueSymptoms.contains(symptom)) {
				uniqueSymptoms.add(symptom);
=======
//	private static int headacheCount = 0;	// initialize to 0
//	private static int rashCount = 0;		// initialize to 0
//	private static int pupilCount = 0;		// initialize to 0
=======
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AnalyticsCounter {
>>>>>>> master
	
	public static void main(String args[]) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));  // reads from original text file
		String eachLine = reader.readLine();   //reads each line of the text file

<<<<<<< HEAD
<<<<<<< HEAD
		int i = 0;	// set i to 0
		int headCount = 0;	// counts headaches
		while (line != null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
>>>>>>> master
			}
		}*/
		// these 4 lines below convert our original and unique ListArrays into Arrays

			String[] arrOriginalSymptomsFile = new String[originalSymptomsFile.size()];
		//	String[] arrUniqueSymptoms = new String[uniqueSymptoms.size()];
			originalSymptomsFile.toArray(arrOriginalSymptomsFile);
		//	uniqueSymptoms.toArray(arrUniqueSymptoms);

			System.out.println(Arrays.toString(arrOriginalSymptomsFile));

		int[] visitedArrOriginalSymptomsFile = new int [arrOriginalSymptomsFile.length];
		int visited = -1;

		for (int i = 0;i<arrOriginalSymptomsFile.length;i++) {
			int counter = 1;
			for (int j = i+1; j < arrOriginalSymptomsFile.length; j++) {
				if (arrOriginalSymptomsFile[i].equals(arrOriginalSymptomsFile[j])) {
					counter++;
					visitedArrOriginalSymptomsFile[j] = visited;
				}
			}
			if (visitedArrOriginalSymptomsFile[i] != visited) {
				visitedArrOriginalSymptomsFile[i] = counter;
			}
		}
		for (int i = 0; i < visitedArrOriginalSymptomsFile.length; i++) {
			if (visitedArrOriginalSymptomsFile[i] != visited) {
				System.out.println("Frequency of " + arrOriginalSymptomsFile[i] + " : " + visitedArrOriginalSymptomsFile[i]);
			}
	//		writer.write(arrOriginalSymptomsFile[i] + " : " + visitedArrOriginalSymptomsFile[i]);
	//		writer.close();



			// next generate output

		}
	}
}










/*for (int i = 1; i <= originalSymptomsFile.size(); i++) {
		for (String uniSymptom : originalSymptomsFile) {
		if(uniqueSymptoms.contains(uniSymptom)) {
		i++;
		System.out.println(uniSymptom + " " + i);
		}
		}
		}*/


/*		System.out.println(originalSymptomsFile);
		System.out.println("This array has " + originalSymptomsFile.size() + " values");



		System.out.println("The unique symptoms from the original symptoms file are:\n" + uniqueSymptoms + "\nThat's " + uniqueSymptoms.size() + " symptoms with the following frequencies: ");

		Set<String> newSet = new HashSet<String>(originalSymptomsFile); // this HashSet variable takes its keys from the originalSymptomsFile array

		for (String symptomElement : newSet) {
			// for each element in originalSymptomsFile reiterate through the new HashSet variable (newSet) and check the following condition/action
			System.out.println(symptomElement + ": " + Collections.frequency(originalSymptomsFile, symptomElement));
		}


*/
//	}
// }

//		for (HashSet sym : newSet) {
//			if(!newSet.contains(sym)) {
//				Set<String, int> sortedSet = new HashSet<String, int>();
//			}
//		}
//		FileInputStream stream = new FileInputStream("symptoms.txt");
//		Scanner scanner = new Scanner(stream);
//		String line = ;
//		while (scanner.hasNextLine()) {
//			symptoms.add();
//		}
//			System.out.println();
//		}
//	}

		// first get input
	//	BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
	//	String line = reader.readLine();
	//	List<String> symptoms = new ArrayList<String>();
	//			while (line != null) {
	//				symptoms.add(line);
	//				System.out.println(symptoms);
	//			}

	//	Scanner scanner = new scanner(System.in);

	//	while (scanner.hasNext()) {
	//		symptoms.add(scanner.next());
	//	}

	//	scanner.close();

//	}

//}
	//	int i = 0;	// set i to 0
	//	int headCount = 0;	// counts headaches
	//	while (line != null) {
	//		i++;	// increment i
	//		System.out.println("symptom from file: " + line);
	//		if (line.equals("headache")) {
	//			headCount++;
	//			System.out.println("number of headaches: " + headCount);
	//		}
	//		else if (line.equals("rush")) {
	//			rashCount++;
	//		}
	//		else if (line.contains("pupils")) {
	//			pupilCount++;
	//		}

	//		line = reader.readLine();	// get another symptom
//		}
		
		// next generate output
//		FileWriter writer = new FileWriter ("result.out");
//		writer.write("headache: " + headCount + "\n");
//		writer.write("rash: " + rashCount + "\n");
//		writer.write("dialated pupils: " + pupilCount + "\n");
//		writer.close();
//	}
// }
=======
		 List<String> symptomsDotText = new ArrayList<String>();
=======
		 List<String> symptomsDotText = new ArrayList<String>();  // new arraylist from the file
>>>>>>> master


		while ((eachLine = reader.readLine()) != null) {  // while loop to add each line of text file to the new arraylist
			symptomsDotText.add(eachLine);
			symptomsDotText.sort(String::compareToIgnoreCase); // sorting elements of arraylist (symptoms) alphabetically
		}

		reader.close();

		String[] symptomsDotTxtToArray = new String [symptomsDotText.size()];  // converting ArrayList to Array
		symptomsDotText.toArray(symptomsDotTxtToArray);
	//	System.out.println(Arrays.toString(symptomsDotTxtToArray));

		FileWriter writer = new FileWriter ("result.out", true);      // introducing filewriter class for later file output using the append option
		int i = 0;

		while (i<symptomsDotTxtToArray.length) {  // double while loop to reiterate through elements of the array and count occurences
			int symptom = i;
			while (i<symptomsDotTxtToArray.length && symptomsDotTxtToArray[i].equals(symptomsDotTxtToArray[symptom])) {
				i++;
			}

			// writing output of the program and to the output.txt
			int count = i - symptom;
			String symptomFrequency = symptomsDotTxtToArray[symptom].toString() + " : " + Integer.toString(count);
			symptomFrequency = symptomFrequency.substring(0,1).toUpperCase() + symptomFrequency.substring(1).toLowerCase();
			System.out.println(symptomFrequency);
			writer.write(symptomFrequency + "\n");
		}
		writer.close();
	}
}
>>>>>>> master

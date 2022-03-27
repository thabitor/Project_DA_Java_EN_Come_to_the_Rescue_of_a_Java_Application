package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class AnalyticsCounter {
//	private static int headCount = 0;    // initialize to 0
//	private static int rashCount = 0;        // initialize to 0
//	private static int pupilCount = 0;        // initialize to 0

	public static void main(String args[]) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
		List<String> originalSymptomsFile = new ArrayList<String>();

		String singleLine;	// this temporary variable refers to each line of the original text file
		while ((singleLine = reader.readLine()) != null) {
			originalSymptomsFile.add(singleLine);
			originalSymptomsFile.sort(String::compareToIgnoreCase);
		}

		reader.close();
		System.out.println(originalSymptomsFile);
		System.out.println("This array has " + originalSymptomsFile.size() + " values");

		ArrayList<String> uniqueSymptoms = new ArrayList<String>();

		for (String element : originalSymptomsFile) {
			//'element' refers to each element of the uniqueSymptoms array; this statement says 'for each element in uniqueSymptoms reiterate through the originalSymptomsFile array and check the following condition/action
			if (!uniqueSymptoms.contains(element)) {
				uniqueSymptoms.add(element);
			}
		}

		System.out.println("The unique symptoms from the original symptoms file are:\n" + uniqueSymptoms + "\nThat's " + uniqueSymptoms.size() + " symptoms with the following frequencies: ");

		Set<String> newSet = new HashSet<String>(originalSymptomsFile); // this HashSet variable takes its keys from the originalSymptomsFile array

		for (String symptomElement : newSet) {
			// for each element in originalSymptomsFile reiterate through the new HashSet variable (newSet) and check the following condition/action
			System.out.println(symptomElement + ": " + Collections.frequency(originalSymptomsFile, symptomElement));
		}
	}
}

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

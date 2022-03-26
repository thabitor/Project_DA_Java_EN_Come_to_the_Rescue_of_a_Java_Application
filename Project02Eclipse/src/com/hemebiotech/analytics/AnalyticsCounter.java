package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalyticsCounter {
//	private static int headCount = 0;    // initialize to 0
//	private static int rashCount = 0;        // initialize to 0
//	private static int pupilCount = 0;        // initialize to 0

	public static void main(String args[]) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
		List<String> symptoms = new ArrayList<String>();

		String line;
		while ((line = reader.readLine()) != null) {
			symptoms.add(line);
		}

		reader.close();
		System.out.println(symptoms);
	}
}

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

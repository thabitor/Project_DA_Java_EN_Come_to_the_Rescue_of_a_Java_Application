package analytics;

import java.util.*;

public class CountData implements ISymptomCounter {

	private List<String> symptomsFromFile;
	/**
	 * 
	 
	 */

	public CountData (List<String> symptomsFromFile) {
		this.symptomsFromFile = symptomsFromFile ;
   }

    public TreeMap <String, Integer> CountSymptoms() {
        TreeMap<String, Integer> counterResult = new TreeMap<String, Integer>();
        for(String element : symptomsFromFile) {
            Integer h = counterResult.get(element);
            counterResult.put(element, (h == null) ? 1 : h + 1);
        } 
        for (Map.Entry<String, Integer> key : counterResult.entrySet()) {
            if (key.getValue() == 1) {
                System.out.println(key.getKey().substring(0, 1).toUpperCase() + 
                key.getKey().substring(1) + " occurs " + 
                key.getValue() + " time.");
            } else {
                System.out.println(key.getKey().substring(0, 1).toUpperCase() + 
                key.getKey().substring(1) + " occurs " + 
                key.getValue() + " times.");
            }
        }
           return counterResult;
        }
}
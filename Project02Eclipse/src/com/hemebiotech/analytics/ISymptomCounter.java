package analytics;

import java.util.*;

/**
 * This returns a hash tree of the counts in an ArrayList
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomCounter {
	/**
	 * 
	 * @return a Tree Map of the symptoms (key) and their counts (value)
	 */
	TreeMap<String, Integer> GetCountTreeMap ();
}

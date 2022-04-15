package analytics;

import java.io.*;


public interface ISymptomWriter  {
	/**
	 * @return this method does not return a value (designed to allow file writing in the class method)
	 */
	void WriteSymptoms() throws IOException;
}

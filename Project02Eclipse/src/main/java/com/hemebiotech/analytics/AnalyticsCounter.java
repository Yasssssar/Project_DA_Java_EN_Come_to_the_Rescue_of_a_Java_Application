package main.java.com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static Map<String,Integer> symptomMap;

	/**
	 *
	 * @param args : prend en parametre le fichier de symptom afin de produire le fichier result.out
	 */
	public static void count(String args[]) {
		symptomMap = new TreeMap<>();
		ReadSymptomDataFromFile r = new ReadSymptomDataFromFile(args[0]);

		r.getSymptoms().stream()
				.forEach(symptom -> {
					int count = symptomMap.containsKey(symptom) ? symptomMap.get(symptom)+1 : 1;
					symptomMap.put(symptom, count);
				});

		if(!symptomMap.isEmpty()) {
			WriteSymptomDataToFile writeSymptomDataSet = new WriteSymptomDataToFile();
			writeSymptomDataSet.writeSymptomDataSet(symptomMap);
		}
	}
}

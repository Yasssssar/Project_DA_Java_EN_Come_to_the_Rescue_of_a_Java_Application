package main.java.com.hemebiotech.analytics;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {

	public static Map<String,Integer> symptomMap;
	
	public static void count(String args[]) throws IOException {
		symptomMap = new HashMap<>();
		ReadSymptomDataFromFile r = new ReadSymptomDataFromFile(args[0]);

		r.GetSymptoms().stream()
				.forEach(symptom -> {
					int count = symptomMap.containsKey(symptom) ? symptomMap.get(symptom)+1 : 1;
					symptomMap.put(symptom, count);
				});

		WriteSymptomDataToFile writeSymptomDataSet = new WriteSymptomDataToFile();
		writeSymptomDataSet.writeSymptomDataSet(symptomMap);
	}
}

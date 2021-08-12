package main.java.com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter implements IAnalyticsCounter{

	private Map<String,Integer> symptomMap;

	/**
	 *
	 * @param args : prend en parametre le fichier de symptom afin de produire le fichier result.out
	 */
	@Override
	public void count(String args[]) {
		symptomMap = new TreeMap<>();
		ISymptomReader r = new ReadSymptomDataFromFile(args[0]);

		r.getSymptoms().stream()
				.forEach(symptom -> {
					int count = symptomMap.containsKey(symptom) ? symptomMap.get(symptom)+1 : 1;
					symptomMap.put(symptom, count);
				});

		if(!symptomMap.isEmpty()) {
			SymptomWriter writeSymptomDataSet = new SymptomWriter();
			writeSymptomDataSet.writeSymptomDataSet(symptomMap);
		}
	}
}

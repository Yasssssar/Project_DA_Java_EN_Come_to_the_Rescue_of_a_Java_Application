package main.java.com.hemebiotech.analytics;

import java.util.Map;

/**
 * Interface ISymptomWriter permettant d'écrire le fichier resultat
 */
public interface ISymptomWriter {
    /**
     *
     * @param symptomMap : Map contenant les symptomes a ecrire dans un fichier
     */
    void writeSymptomDataSet(Map<String, Integer> symptomMap);
}

package main.java.com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * la classe ReadSymptomDataFromFile lit un fichier et renvoie une liste de data
 */

public class ReadSymptomDataFromFile implements ISymptomReader {

	/**
	 * le chemin du fichier a lire
	 */
	private String filepath;

	/**
	 * Constructeur
	 * @param filepath :  le chemin du fichier a lire
	 */
	ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 *
	 * @return : Liste de symptome lu depuis un fichier
	 */
	@Override
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<>();

			try (BufferedReader reader = new BufferedReader (new FileReader(filepath)))
			{
				String line = reader.readLine();
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
			} catch (IOException e) {
				System.out.println("ERROR : Un probleme est survenue lors de la lecture du fichier " + filepath);
			}

		return result;
	}
}

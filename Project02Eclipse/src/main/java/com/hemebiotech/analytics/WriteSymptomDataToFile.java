package main.java.com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile {

    public void writeSymptomDataSet(Map<String,Integer> symptomMap) {


        try(FileWriter writer = new FileWriter("result.out");
            BufferedWriter bufferedWriter = new BufferedWriter(writer))
        {
            for (var input : symptomMap.entrySet()) {
                bufferedWriter.write(input.getKey()+","+input.getValue());
                bufferedWriter.newLine();
            }
            System.out.println("INFO : Le fichier result.out a bien été produit");
        } catch (IOException e) {
            System.out.println("ERROR : Un probleme est survenue lors de l'ecriture du fichier de resultat");
        }
    }


}

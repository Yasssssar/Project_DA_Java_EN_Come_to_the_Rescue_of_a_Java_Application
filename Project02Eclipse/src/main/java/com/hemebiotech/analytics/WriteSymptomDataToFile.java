package main.java.com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile {

    public void writeSymptomDataSet(Map<String,Integer> symptomMap) throws IOException {
        FileWriter writer = new FileWriter("result.out");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        for (var input : symptomMap.entrySet()) {
            bufferedWriter.write(input.getKey()+","+input.getValue());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }


}

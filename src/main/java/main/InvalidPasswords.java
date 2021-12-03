package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InvalidPasswords {

    private InvalidPasswords() {
    }

    public static List<String> getInvalidPasswords() {
        List<String> invalidPasswords = new ArrayList<>();
        try {
            String filePath = "./resources/InvalidPasswords.csv";
            FileReader fileReader = new FileReader(filePath);
            invalidPasswords = readLines(fileReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return invalidPasswords;
    }

    private static List<String> readLines(FileReader fileReader) {
        List<String> invalidPasswords = new ArrayList<>();
        final String delimiter = ",";
        String line;
        try (BufferedReader reader = new BufferedReader(fileReader)) {
            while ((line = reader.readLine()) != null) {
                String[] allPasswordsInLine = line.replace(" ", "").split(delimiter);
                Collections.addAll(invalidPasswords, allPasswordsInLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return invalidPasswords;
    }

}

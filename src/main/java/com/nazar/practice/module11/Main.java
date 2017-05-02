package com.nazar.practice.module11;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> wordsToReplace = new HashMap<>();
        wordsToReplace.put("hehe", "Bigg BoSS");
        wordsToReplace.put("arara", "BATYA");
        try {
            IOTribute fileWithSampleText = IOTribute.getInstance();
            System.out.println("Initial file contents:\n" + fileWithSampleText.readFileContentsToString());
            System.out.println("\nString with replaced words:");
            System.out.println(fileWithSampleText.replacer(wordsToReplace));
            System.out.print("\nRewriting file with the new string... ");
            fileWithSampleText.fileContentsReplacer(wordsToReplace);
            System.out.println("Done!");
            System.out.print("Appending new string to file... ");
            fileWithSampleText.fileContentsMerge(wordsToReplace);
            System.out.println("Done!");
            System.out.println("\nResulting file contents:\n" + fileWithSampleText.readFileContentsToString());
            System.out.println("\nNumber of occurrences of word \"Nazar\": " + fileWithSampleText.checkWord("Nazar"));
            System.out.println("Number of occurrences of word \"Yanovets\": " + fileWithSampleText.checkWord("Yanovets"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

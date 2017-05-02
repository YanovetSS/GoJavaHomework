package com.nazar.practice.module11;

import java.io.*;
import java.util.Map;
import java.util.stream.Collectors;

public class IOTribute {
    private static IOTribute fileWithSampleText;
    private File textFile;

    private IOTribute() throws IOException {
        makeEmptyTextFile("Yanovets.txt");
        fillFileWithSampleText();
    }

    public static synchronized IOTribute getInstance() throws IOException {
        if (fileWithSampleText == null) {
            fileWithSampleText = new IOTribute();
        }
        return fileWithSampleText;
    }

    private void makeEmptyTextFile(String fileName) throws IOException {
        textFile = new File(fileName);
        try {
            if (!textFile.createNewFile()) {
                new PrintWriter(fileName).close();
            }
        } catch (IOException e) {
            System.out.println("Error creating file!");
            throw e;
        }
    }

    private void fillFileWithSampleText() throws IOException {
        try (PrintWriter fileWriter = new PrintWriter(new FileWriter(textFile))) {
            fileWriter.println("Nazar Yanovets hehe");
            fileWriter.println("Oleg Yanovets arara");
        } catch (IOException e) {
            System.out.println("Error initialising file!");
            throw e;
        }
    }

    public File fileContentsReplacer(Map<String, String> wordsToReplace) throws IOException {
        String outputString = replacer(wordsToReplace);
        return writeContentsToFile(outputString, false);

    }

    public File fileContentsMerge(Map<String, String> wordsToReplace) throws IOException {
        String outputString = replacer(wordsToReplace);
        return writeContentsToFile(outputString, true);
    }

    public String readFileContentsToString() throws IOException {
        StringBuilder outputString = new StringBuilder();
        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(textFile))) {
            outputString.append(bufferedFileReader.lines().collect(Collectors.joining(System.lineSeparator())));
        } catch (IOException e) {
            System.out.println("Error reading file!");
            throw e;
        }
        return outputString.toString();
    }

    public String replacer(Map<String, String> wordsToReplace) throws IOException {
        String outputString = readFileContentsToString();
        for (Map.Entry<String, String> entry : wordsToReplace.entrySet()) {
            outputString = outputString.replaceAll(entry.getKey(), entry.getValue());
        }
        return outputString;
    }

    public File writeContentsToFile(String contents, boolean append) throws IOException {
        try (BufferedWriter bufferedFileWriter = new BufferedWriter(new FileWriter(textFile, append))) {
            bufferedFileWriter.write(contents);
            bufferedFileWriter.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file");
            throw e;
        }
        return textFile;
    }

    public int checkWord(String word) throws IOException {
        return readFileContentsToString().split(word).length - 1;
    }


    public String readFileContentsToStringJava6() throws IOException {
        StringBuilder outputString = new StringBuilder();
        String textLine;
        BufferedReader bufferedFileReader = null;
        try {
            bufferedFileReader = new BufferedReader(new FileReader(textFile));
            while ((textLine = bufferedFileReader.readLine()) != null) {
                outputString.append(textLine);
                outputString.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Error reading file!");
            throw e;
        } finally {
            if (bufferedFileReader != null) {
                bufferedFileReader.close();
            }
        }
        return outputString.toString();
    }
}

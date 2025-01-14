package Blatt_9.Aufgabe_1;

import java.io.*;


class CharacterCounter {

    String readFileContent(String filename) throws IOException {
        StringBuilder builder = new StringBuilder();
        try (FileReader fileReader = new FileReader(filename);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;

            while ((line = bufferedReader.readLine()) != null){
            builder.append(line).append("\n");
            }
        }
        return builder.toString();
    }

    Counter count(String content){

        int lines = 0;
        int words = 0;
        int chars = 0;

        //split lines
        String[] lineArray = content.split("\n");
        lines = lineArray.length;

        for (String line : lineArray) {
            //remove whitespaces in fron and back
            String trimmedLine = line.trim();
            if (!trimmedLine.isEmpty()) {
                //count characters and words (with regex argument)
                words += trimmedLine.split("\\s+").length;
                chars += trimmedLine.length();
            }
        }
        return new Counter(lines, words, chars);
    }

    public static void main(String[] args) {
        //test whether an args is specified
        if (args.length < 1) {
            System.out.println("Please insert filename as argument.");
            return;
        }

        String filename = args[0];
        CharacterCounter counter = new CharacterCounter();


        try {
            String content = counter.readFileContent(filename);
            Counter result = counter.count(content);

            //System.out.println(content);
            System.out.println("Number of lines: " + result.getLines());
            System.out.println("Number of words: " + result.getWords());
            System.out.println("Number of characters: " + result.getCharacters());
        } catch (FileNotFoundException e) {
            System.err.println("File " + filename + " not found.");
        } catch (IOException e) {
            System.err.println("Fault: " + e.getMessage());
        }
    }
}
class Counter {
    private final int lines;
    private final int words;
    private final int characters;

    public Counter(int lines, int words, int characters) {
        this.lines = lines;
        this.words = words;
        this.characters = characters;
    }

    public int getLines() {
        return lines;
    }

    public int getWords() {
        return words;
    }

    public int getCharacters() {
        return characters;
    }
}
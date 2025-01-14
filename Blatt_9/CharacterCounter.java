import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.FileReader;
import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class CharacterCounter {

    public static String readFileContent(String filename) throws FileNotFoundException, IOException {
        StringBuilder content = new StringBuilder();

        // try-with-resources stellt sicher, dass die Ressourcen (Reader) korrekt geschlossen werden
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        if (reader == null) {
            throw new FileNotFoundException("Datei nicht gefunden: " + filename);
        }

        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append(System.lineSeparator());
        }

        return content.toString();
    }



    public static Counter count(String content) {
        String[] lines = content.split("\\R"); // \\R erfasst alle Arten von Zeilenumbrüchen

        String[] words = content.trim().split("\\s+"); // \\s+ erfasst alle Arten von Leerraum

        int letterCount = 0;
        for (char c : content.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }
        Counter counter = new Counter(lines.length, words.length, letterCount);
        return counter;
    }



    public static void main(String[] args) throws IOException {
        String fileName = "/Users/simon/Developer/hka_prog1/Blatt_9/Aufgabe_2_Unittests mit JUnit.txt";
        String fileContent = "";
        try {
            fileContent = readFileContent(fileName);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Inhalt der Datei:");
        System.out.println(fileContent);

        Counter counter = null;
        try {
            counter = count(fileContent);
        } catch (Exception e) {
            System.out.println("Es ist ein Fehler aufgetreten!");
        }
        System.out.println("Anzahl der Zeilen: ");
        System.out.println(counter.lines);
        System.out.println("Anzahl der Wörter: ");
        System.out.println(counter.words);
        System.out.println("Anzahl der Zeichen: ");
        System.out.println(counter.chars);



        System.out.println();
        System.out.println();
        System.out.println();




        //Unittest Datei einlesen (nicht gefordert)
        fileName = "/Users/simon/Developer/hka_prog1/Blatt_9/JUnitTest.txt";
        fileContent = "";
        try {
            fileContent = readFileContent(fileName);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Inhalt der Datei:");
        System.out.println(fileContent);

        counter = null;
        try {
            counter = count(fileContent);
        } catch (Exception e) {
            System.out.println("Es ist ein Fehler aufgetreten!");
        }
        System.out.println("Anzahl der Zeilen: ");
        System.out.println(counter.lines);
        System.out.println("Anzahl der Wörter: ");
        System.out.println(counter.words);
        System.out.println("Anzahl der Zeichen: ");
        System.out.println(counter.chars);



        //Aufgabe 2 JUnit Tests
        String testFileName = "/Users/simon/Developer/hka_prog1/Blatt_9/JUnitTest.txt";
        fileContent = readFileContent(testFileName);
        assertNotNull(fileContent);

        counter = count(fileContent);
        assertEquals(2, counter.lines);
        assertEquals(6, counter.words);
        assertEquals(22, counter.chars);
    }
}
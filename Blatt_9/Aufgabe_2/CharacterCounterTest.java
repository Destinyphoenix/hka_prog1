package Blatt_9.Aufgabe_1;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCounterTest {
    @Test
    void testReadFileContent_EmptyFile() throws IOException {
        CharacterCounter counter = new CharacterCounter();
        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/emptyFile.txt");

        assertEquals("", content);
    }

    @Test
    void testReadFileContent_SmallFile() throws IOException {
        String expectedContent = "Hallo Welt!\nDies ist ein Text.\n";
        CharacterCounter counter = new CharacterCounter();

        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/smallFile.txt");

        assertEquals(expectedContent, content);
    }

    @Test
    void testReadFileContent_MissingFile() {
        CharacterCounter counter = new CharacterCounter();

        Exception exception = assertThrows(IOException.class, () -> {
            counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/noFile.txt");
        });

        assertTrue(exception.getMessage().contains("noFile.txt"));
    }

    @Test
    void testCounterFile1() throws IOException {
        CharacterCounter counter = new CharacterCounter();
        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/shorttext_1.txt");
        Counter result = counter.count(content);

        assertEquals(3, result.getLines());
        assertEquals(11, result.getWords());
        assertEquals(58, result.getCharacters());
    }
    @Test
    void testCounterFile2() throws IOException {
        CharacterCounter counter = new CharacterCounter();
        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/shorttext_2.txt");
        Counter result = counter.count(content);

        assertEquals(3, result.getLines());
        assertEquals(12, result.getWords());
        assertEquals(80, result.getCharacters());
    }

    @Test
    void testCounterFile3() throws IOException {
        CharacterCounter counter = new CharacterCounter();
        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/shorttext_3.txt");
        Counter result = counter.count(content);

        assertEquals(1, result.getLines());
        assertEquals(0, result.getWords());
        assertEquals(0, result.getCharacters());
    }

    @Test
    void testCounterFile4() throws IOException {
        CharacterCounter counter = new CharacterCounter();
        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/mediumtext_1.txt");
        Counter result = counter.count(content);

        assertEquals(9, result.getLines());
        assertEquals(81, result.getWords());
        assertEquals(543, result.getCharacters());
    }

    @Test
    void testCounterFile5() throws IOException {
        CharacterCounter counter = new CharacterCounter();
        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/mediumtext_2.txt");
        Counter result = counter.count(content);

        assertEquals(8, result.getLines());
        assertEquals(75, result.getWords());
        assertEquals(497, result.getCharacters());
    }

    @Test
    void testCounterFile6() throws IOException {
        CharacterCounter counter = new CharacterCounter();
        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/mediumtext_3.txt");
        Counter result = counter.count(content);

        assertEquals(14, result.getLines());
        assertEquals(64, result.getWords());
        assertEquals(339, result.getCharacters());
    }

    @Test
    void testCounterFile7() throws IOException {
        CharacterCounter counter = new CharacterCounter();
        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/longtext_1.txt");
        Counter result = counter.count(content);

        assertEquals(29, result.getLines());
        assertEquals(405, result.getWords());
        assertEquals(2735, result.getCharacters());
    }

    @Test
    void testCounterFile8() throws IOException {
        CharacterCounter counter = new CharacterCounter();
        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/longtext_2.txt");
        Counter result = counter.count(content);

        assertEquals(34, result.getLines());
        assertEquals(215, result.getWords());
        assertEquals(1207, result.getCharacters());
    }

    @Test
    void testCounterFile9() throws IOException {
        CharacterCounter counter = new CharacterCounter();
        String content = counter.readFileContent("Blatt_9/Aufgabe_2/Test_Files/longtext_3.txt");
        Counter result = counter.count(content);

        assertEquals(24, result.getLines());
        assertEquals(212, result.getWords());
        assertEquals(1637, result.getCharacters());
    }
}
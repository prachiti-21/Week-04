package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;

public class FileProcessorTest {
    private final FileProcessor fileProcessor = new FileProcessor();
    private static final String TEST_FILE = "testfile.txt";

    @BeforeEach
    public void setUp() throws IOException {
        new File(TEST_FILE).delete(); // Ensure file does not exist before each test
    }

    @Test
    public void testWriteAndReadFile() throws IOException {
        String content = "Hello, JUnit!";
        fileProcessor.writeToFile(TEST_FILE, content);
        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent, "File content does not match");
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(TEST_FILE, "Test content");
        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "File should exist after writing");
    }

    @Test
    public void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
    }

    @AfterEach
    public void tearDown() {
        new File(TEST_FILE).delete(); // Clean up after each test
    }
}

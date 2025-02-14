package com.bytearraystream;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ConvertImage {
    public static void main(String[] args) {
        String inputImagePath = "panda.jpg";  // Change to your image path
        String outputImagePath = "output.jpg";

        try {
            // Convert image to byte array
            byte[] imageBytes = convertImageToByteArray(inputImagePath);

            // Write byte array back to image file
            writeByteArrayToImage(imageBytes, outputImagePath);

            // Verify if both files are identical
            boolean isIdentical = verifyImages(inputImagePath, outputImagePath);
            System.out.println("Are the original and new images identical? " + isIdentical);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static byte[] convertImageToByteArray(String imagePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            Files.copy(new File(imagePath).toPath(), baos);
            return baos.toByteArray();
        }
    }

    public static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static boolean verifyImages(String path1, String path2) throws IOException {
        byte[] file1Bytes = Files.readAllBytes(new File(path1).toPath());
        byte[] file2Bytes = Files.readAllBytes(new File(path2).toPath());
        return Arrays.equals(file1Bytes, file2Bytes);
    }
}

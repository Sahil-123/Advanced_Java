package com.xworkz.Runner;

import java.io.*;

public class ReadAndWriteToFile {
    public static void main(String[] args) {
        File readFromFile = new File("src/main/File/FileToRead.txt");
        File writeToFile = new File("src/main/File/FileToWrite.txt");

        try(BufferedReader reader = new BufferedReader(new FileReader(readFromFile));
            PrintWriter writer = new PrintWriter(writeToFile)) {
            System.out.println("File reading and writing initiated....!");

            String line = reader.readLine();
            while(line != null){
                writer.println(line);
                line = reader.readLine();
            }

            writer.flush();

            System.out.println("File reading and writing Completed successfully....!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

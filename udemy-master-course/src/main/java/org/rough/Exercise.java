package org.rough;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.Scanner;

public class Exercise {
    public static boolean createFile(String fileName) {
        boolean created = false;
        File file = new File(fileName);

        try {

            if (file.createNewFile()) {
                System.out.println("File Created with mention name: " + fileName);
                return created = true;
            } else {
                System.out.println("File name already exist");
            }

        } catch (Exception e) {
            System.out.println("Error:" + e);
        } finally {
            return created;
        }


    }

    public static boolean writeToFile(String fileName, String content) {
        boolean created = false;
        File file = new File(fileName);

        try {

            if (file.createNewFile()) {
                System.out.println("File Created with mention name: " + fileName);

                try {
                    FileWriter fileWriter = new FileWriter(file, true);
                    fileWriter.write(content);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                return created = true;
            } else {
                System.out.println("File name already exist");
            }

        } catch (Exception e) {
            System.out.println("Error:" + e);
        } finally {
            return created;
        }

    }
//
    public static StringBuffer readFromFile(String fileName) {

        String string = "";
        StringBuffer str = new StringBuffer(string);
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String data = scanner.nextLine();
                System.out.print(data);
                str.append(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }

        return str;
    }

    public static void main(String[] args) {

        createFile("sample1.txt");
        writeToFile("sample2.txt", "Hi this is ajay");
        readFromFile("sample2.txt");

    }
}

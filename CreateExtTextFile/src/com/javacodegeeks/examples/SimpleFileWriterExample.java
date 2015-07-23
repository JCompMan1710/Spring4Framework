package com.javacodegeeks.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriterExample {
    public static void main(String[] args) {
        FileWriter fw;
        try {
            fw = new FileWriter(new File("/users/john/mytextfile.txt"));

            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Done");
    }
}
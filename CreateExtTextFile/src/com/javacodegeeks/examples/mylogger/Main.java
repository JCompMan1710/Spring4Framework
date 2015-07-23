package com.javacodegeeks.examples.mylogger;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Logger log1 = new Logger("file1.txt");
        File f = new File("file2.txt");
        Logger log2 = new Logger(f);

        log1.log("Testing writing text file");
        log2.log("Testing the Logger function");
	}
}

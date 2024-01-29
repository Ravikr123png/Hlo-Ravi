package com.example.ravi;

import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) throws IOException {
        String fileBName = "Ravi.text";
        FileWriter writer =new FileWriter(fileBName);
        writer.write("hi Ravi");
        for (int i = 0; i < 1000; i++) {
            writer.write("*");
        }
        writer.flush();
        System.out.println("File writen sucessfully");
    }
}

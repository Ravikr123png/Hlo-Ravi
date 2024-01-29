package com.example.ravi;

import java.util.Scanner;

public class multitable {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Create new table");
        System.out.println("Enter your no : ");
        int num = scanner.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num) {
        int i = 1;
        while (i<=10){
            System.out.println(num + " * " + i +"="+(num * i));
            i++;
        }
    }
}

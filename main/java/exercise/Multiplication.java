package exercise;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ths is your no of multiplation : ");
        int num = input.nextInt();
        for (int i = 1; i<=10; i++){;
        System.out.println(num + " X " + i + " = " +(num*i));
    }
}
}
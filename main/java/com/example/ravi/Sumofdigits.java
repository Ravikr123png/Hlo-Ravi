package com.example.ravi;
import java.util.Scanner;
class Sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wlecome Ravi Blogs.........");
        System.out.println("Enter Your no........");
        int num = scanner.nextInt();
        int sum = printSumofDigits(num);
        System.out.println("sum of digit: " + sum);
    }

    public static int printSumofDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
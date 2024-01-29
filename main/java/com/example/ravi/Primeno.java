package com.example.ravi;
import java.util.Scanner;
public class Primeno {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to prime number checker");
            System.out.print("Please enter the number: ");
            int num = scanner.nextInt();
            System.out.println("Your number is " +
                    (isPrime(num) ? "Prime" : "Not Prime"));
        }

        public static boolean isPrime(int num) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


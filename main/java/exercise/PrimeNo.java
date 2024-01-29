package exercise;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to new prime no :  ");
        int num = input.nextInt();;
        System.out.print("Your no is prime is " +
                (isPrimeNo(num)? "prime": "NOt prime"));

    }

    public static boolean isPrimeNo(int num) {
        for( int i =2; i<num; i++){
            if(num%i==0 ){
                return false;
            }
        }
        return true;
    }
}

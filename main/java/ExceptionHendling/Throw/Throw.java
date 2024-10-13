package ExceptionHendling.Throw;

import java.util.Scanner;

public class Throw {

    public static void main(String[] args) {
        System.out.println("Hi all Good Morning  :  ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the your no :  ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
//        int add = num1+num2;
        int sum = num1 + num2;
        System.out.println(sum);
    }
}

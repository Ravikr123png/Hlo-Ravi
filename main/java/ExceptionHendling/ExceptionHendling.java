package ExceptionHendling;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionHendling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the your no :  ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try {
            int[] num = new int[5];
             num[4] = num1/num2;
//            int divide = num1 / num2;
            System.out.println("your result is :  " + Arrays.toString(num));
        } catch (Throwable exception) {
            System.out.println(" not esxcute for zero ..plz enter vaild no");

        }
    }
}
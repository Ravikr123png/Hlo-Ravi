package com.example.ravi;

public class nested {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b) {
            if(a < b){
                System.out.println("B is greater then a");
            }else {
                System.out.println("A is greater");
            }
            }else{
                if (b > c) {
                    System.out.println("A is not greater");
                } else {
                    System.out.println("Not greater");
                }
            }
        }
    }






package com.google;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float num_1, num_2;
        System.out.println("Enter first number");
        Scanner scan = new Scanner(System.in);
        num_1 = scan.nextFloat();
        System.out.println("Enter second number");
        Scanner scan2 = new Scanner(System.in);
        num_2 = scan2.nextFloat();
        System.out.println("You have entered: ");
        System.out.println(num_1);
        System.out.println("and");
        System.out.println(num_2);
        String prompt = "Enter 0 for addition, 1 for subtraction,2 for multiplication,3 for division ";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch(input){
            case 0: System.out.println("Adding these numbers");
                    System.out.println(num_1+num_2);
            break;
            case 1: System.out.println("Subtracting these numbers:");
            System.out.println(num_1-num_2);
                    break;
            case 2: System.out.println("Multiplication of these numbers: ");
               System.out.println(num_1*num_2);
                   break;
            case 3: System.out.println("Dividing these numbers:");
                 System.out.println(num_1/num_2);
               break;
            default: System.out.println("Invalid operator");


        }

    }
}



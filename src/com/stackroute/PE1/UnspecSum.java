/**
 * This program that reads an unspecified number of integer arguments using
 * Scanner Class and adds them together. The program should display total of
 * the given input number and should only consider integer value.The program
 * should display an error message if there are any non integer values
 */
package com.stackroute.PE1;

import java.util.Scanner;
public class UnspecSum {
    public static void main(String[] args) {
        int inputNumber;
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Numbers:");

        while(input.hasNextInt())
        {
            inputNumber=input.nextInt();
            sum=sum+inputNumber;
        }
        System.out.println("Oops! You didn't enter an Integer Number.\n");
        System.out.println("Sum = "+sum);

    }

}

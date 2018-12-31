import java.util.Scanner;
/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 * This program that reads an unspecified number of integer arguments using
 * Scanner Class and adds them together. The program should display total of
 * the given input number and should only consider integer value.The program
 * should display an error message if there are any non integer values
 */
public class UnspecSum {
    public static void main(String[] args) {
        int num;
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Numbers:");

        while(input.hasNextInt())
        {
            num=input.nextInt();
            sum=sum+num;
        }
        System.out.println("Oops! You didn't enter an Integer Number.\n");
        System.out.println("Sum = "+sum);

    }

}

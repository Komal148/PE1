/**
 * This Program which accepts a number from user as input
 * (set the limit say 1 - 50 or 1 - 100) User should guess
 * until the the target number is guessed correctly.
 * Print separate messages for the following:
 *     a. Number guessed is more than original number
 *     b. Number guessed is less than original number
 *     c. Number guessed matches the original number
 */
package com.stackroute.PE1;

import java.util.Scanner;

public class OriginalNum {


    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number:");

        while (input.hasNextInt()) {
            num = input.nextInt();
            if( num >=1 && num <= 100 )
            {
                System.out.println("Number guessed matches the original number" );
                break;
            }
            else if( num <=1 )
            {
                System.out.println("Number guessed is less than the original number" );
            }
            else
            {
                System.out.println("Number guessed is more than the original number" );
            }
        }

    }
}

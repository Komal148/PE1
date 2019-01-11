/**
 * This Program is about  2 inputs , where input1 is string and input 2 is
 * integer value, the last n characters should repeat n number of times
 * in the output String.
 */
package com.stackroute.PE1;

import java.util.Scanner;

public class RepeatWord {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter String:");
        String inputString = input.nextLine();
        System.out.println("Enter number:");
        int n = input.nextInt();

        for (int i = 0; i <= inputString.length() - 1; i++ ) {
            System.out.print(inputString.charAt(i));
        }
        for (int j = 0; j < n; j++) {
            for (int i = inputString.length() - n; i <= inputString.length() - 1; i++) {
                System.out.print(inputString.charAt(i));
            }
        }
    }
}

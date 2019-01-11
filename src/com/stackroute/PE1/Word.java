/**
 *  This program is about
 *   a. Print an error message if the input is not a letter
 *   b. If the input having more than one letter, print the required output
 *    (Vowel or Consonant) for each letter
 */
package com.stackroute.PE1;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String");
        String inputString=input.nextLine();
        char character;
        for(int i=0; i<inputString.length() ;i++ ) {
            character=inputString.charAt(i);
            if( character== 'a' || character =='e' || character =='i' || character =='o' || character == 'u' )
            {
                System.out.println(inputString.charAt(i) + " = Vowel");
            }
            else
            {
                System.out.println(inputString.charAt(i) + " = Consonent");
            }
        }

    }
}

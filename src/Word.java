/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 *  This program is about
 *   a. Print an error message if the input is not a letter
 *   b. If the input having more than one letter, print the required output
 *    (Vowel or Consonant) for each letter
 */
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String");
        String str=input.nextLine();
        char c;
        for(int i=0; i<str.length() ;i++ ) {
            c=str.charAt(i);
            if( c== 'a' || c =='e' || c =='i' || c =='o' || c == 'u' )
            {
                System.out.println(str.charAt(i) + " = Vowel");
            }
            else
            {
                System.out.println(str.charAt(i) + " = Consonent");
            }
        }

    }
}

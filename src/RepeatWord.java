/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 * This Program is about  2 inputs , where input1 is string and input 2 is
 * integer value, the last n characters should repeat n number of times
 * in the output String.
 */

import java.util.Scanner;

public class RepeatWord {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = input.nextLine();
        System.out.println("Enter number:");
        int n = input.nextInt();

        for (int i = 0; i <= str.length() - 1; i++ ) {
            System.out.print(str.charAt(i));
        }
        for (int j = 0; j < n; j++) {
            for (int i = str.length() - n; i <= str.length() - 1; i++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}

/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 * This Program is about
 * a. sort the number in non-increasing order
 * b. after sorting sum all the even numbers, the sum should be greater than 15 .
 * c. if sum is more than 15,then print output as true or false.
 */
import java.util.Scanner;

public class Letters {

    public static void main(String[] args) {
        char c;
        Scanner input=new Scanner(System.in);
        c =input.next().charAt(0);
        if( c >=65 && c <= 90 )
        {
            System.out.println("Capital Letter");
        }
        else if( c >=97 && c <= 122 )
        {
            System.out.println("Small Letter");
        }
        else if( c >= 48 && c <= 57 )
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Symbol");
        }

    }
}
/**
 * This Program is about
 * a. sort the number in non-increasing order
 * b. after sorting computeSum all the even numbers, the computeSum should be greater than 15 .
 * c. if computeSum is more than 15,then print output as true or false.
 */
package com.stackroute.PE1;

import java.util.Scanner;

public class Letters {

    public static void main(String[] args) {
        char charcter;
        Scanner input=new Scanner(System.in);
        charcter =input.next().charAt(0);
        if( charcter >=65 && charcter <= 90 )
        {
            System.out.println("Capital Letter");
        }
        else if( charcter >=97 && charcter <= 122 )
        {
            System.out.println("Small Letter");
        }
        else if( charcter >= 48 && charcter <= 57 )
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Symbol");
        }

    }
}
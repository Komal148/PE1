/**
 * This Program is about
 * a. Print Tom if number is odd and exists between 20 to 30
 * b. Print Jerry, if number is even and exists between 20 and 30
 */
package com.stackroute.PE1;

import java.util.Scanner;

public class TomJerry {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Number:");
        int inputNumber=input.nextInt();
        if( inputNumber>=20 && inputNumber<=30 )
        {
            if( inputNumber%2 != 0 )
            {
                System.out.println("Tom");
            }
            else
            {
                System.out.println("Jerry");
            }
        }
        else
        {
            System.out.println("Oops! Entered number is not between 20 and 30.");
        }
    }
}

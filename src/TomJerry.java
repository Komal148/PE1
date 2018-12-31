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
 * a. Print Tom if number is odd and exists between 20 to 30
 * b. Print Jerry, if number is even and exists between 20 and 30
 */
import java.util.Scanner;

public class TomJerry {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Number:");
        int num=input.nextInt();
        if( num>=20 && num<=30 )
        {
            if( num%2 != 0 )
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

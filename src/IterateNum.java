/*
 * %W% %E%
Komal Rani
 *
 * Copyright (c) Komal Rani All rights reserved.
 * This code has been solemnly made by Komal Rani
 * Working In Boeing India Pvt. Ltd.
 */

/**
 * a program using a loop to print the following output.
 * 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6       6 6 . . . nth iteration.
 */
import java.util.Scanner;

public class IterateNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int num=input.nextInt();
        for( int i=1; i<=num; i++ )
        {
            for( int j=1; j<=i ;j++ )
            {
                System.out.print(i+" ");
            }
        }
    }
}

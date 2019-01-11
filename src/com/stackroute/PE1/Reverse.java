/**
 * This Program to reverse any string without using String Buffer
 */
package com.stackroute.PE1;

import java.util.Scanner;

public class Reverse {
    public static void main(String args[])
    {
        String inputString;
        Scanner in=new Scanner(System.in);
        inputString=in.nextLine();
        for( int i=inputString.length()-1 ; i >= 0 ; i-- )
        {
            System.out.print(inputString.charAt(i));
        }
    }
}

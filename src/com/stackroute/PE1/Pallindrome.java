/**
 * This Program which accepts a number as input and check whether the given
 number is palindrome or not If it is a palindrome then
 a. Add all the even numbers and check whether the computeSum is more than 25.
 b. Print success and failure messages for all 3 conditions
 */
package com.stackroute.PE1;

import java.util.Scanner;


public class Pallindrome {

        public static int pallindromeCheck(int number) /*Checking whether it is a pallindrome or not*/
        {
            int n=number;
            int r=0;
            int remainder;
            while( n!=0 )
            {
               remainder=n%10;
               r=r*10+remainder;
               n=n/10;
            }
            if( number == r )
                return 1;

            return 0;
        }

        public static int computeSum(int n) /*evaluating Sum */
        {
            int sum=0;
            while( (n%10) != 0 )
            {

                if( (n%10)%2 == 0)
                {
                    sum=sum+(n%10);
                }
                n=n/10;
            }
            if( sum > 25 )
                return 1;
            else
                return 2;
        }

        public static void main(String[] args) {

            int pallindromeNumber;

            System.out.println("Enter a number:");
            Scanner input = new Scanner(System.in);

            pallindromeNumber = input.nextInt();

            if (pallindromeCheck(pallindromeNumber) == 1) {
                if (computeSum(pallindromeNumber) == 1) {
                    System.out.println("hello");
                    System.out.println(pallindromeNumber + " is a palindrome and computeSum of even number is more than 25.");
                }
                else if (computeSum(pallindromeNumber) == 2) {
                    System.out.println(pallindromeNumber + " is a palindrome and computeSum of even number is less than 25.");
                }
            }
            else {
                System.out.println(pallindromeNumber + " is not a pallindrome");
            }
        }

}

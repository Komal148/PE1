/**
 * This Program is about
 * a. sort the number in non-increasing order
 * b. after sorting computeSum all the even numbers, the computeSum should be greater than 15 .
 * c. if computeSum is more than 15,then print output as true or false.
 */
package com.stackroute.PE1;

import java.util.Scanner;

public class SortNum {
    static void sort(int arr[],int n)
    {
        int temp;

        for( int i=0; i<n ; i++ )
        {
            for(int j=i+1 ; j<n; j++ )
            {
               if( arr[i] < arr[j] )
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }
    }
    static void sortDigits(int num )
    {
        String str=Integer.toString(num) ;
        int len= str.length();
        /**
         * Defining an array for the integer values
         */
        int numberArray[] = new int[len];
        int k;
        int i=0;
        int n=num;

        while( n != 0)
        {
            k = n%10;
            numberArray[i++]=k;
            n = n/10;
        }

        sort(numberArray,len);  /*Sort Method */
        System.out.println("Sorted Number is non-decreasing order");
        for( i=0; i<len ;i++ )
        {
            System.out.print(numberArray[i]);
        }
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        int num;
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        sortDigits(num); /*Method arrange digits in an array */

        int sum=0;
        while( num !=0 )
        {
            if( (num%10)%2 == 0 )
            {
                sum=sum+(num%10);


            }
            num=num/10;
        }
        System.out.println("computeSum = "+sum);
        if( sum > 15)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

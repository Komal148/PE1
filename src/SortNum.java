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

public class SortNum {
    static void Sort(int arr[],int n)
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
    static void SortDigits(int num )
    {
        String str=Integer.toString(num) ;
        int len= str.length();
        /**
         * Defining an array for the integer values
         */
        int arr[] = new int[len];
        int k;
        int i=0;
        int n=num;

        while( n != 0)
        {
            k = n%10;
            arr[i++]=k;
            n = n/10;
        }

        Sort(arr,len);  /*Sort Method */
        System.out.println("Sorted Number is non-decreasing order");
        for( i=0; i<len ;i++ )
        {
            System.out.print(arr[i]);
        }
        System.out.println("\n");
    }
    public static void main(String[] args)
    {
        int num;
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        SortDigits(num); /*Method arrange digits in an array */

        int sum=0;
        //System.out.println(sum);
        while( num !=0 )
        {
            if( (num%10)%2 == 0 )
            {
                sum=sum+(num%10);


            }
            num=num/10;
        }
        System.out.println("sum = "+sum);
        if( sum > 15)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

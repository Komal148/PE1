import java.util.Scanner;


public class Pallindrome {

        public static int Palcheck(int num)
        {
            int n=num;
            int r=0;
            int rem;
            while( n!=0 )
            {
               rem=n%10;
               r=r*10+rem;
               n=n/10;
            }
            if( num == r )
                return 1;

            return 0;
        }
        public static int Sum(int n)
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

            int palnum;

            System.out.println("Enter a number:");
            Scanner input = new Scanner(System.in);

            palnum = input.nextInt();

            if (Palcheck(palnum) == 1) {
                if (Sum(palnum) == 1) {
                    System.out.println("hello");
                    System.out.println(palnum + " is a palindrome and sum of even number is more than 25.");
                }
                else if (Sum(palnum) == 2) {
                    System.out.println(palnum + " is a palindrome and sum of even number is less than 25.");
                }
            }
            else {
                System.out.println(palnum + " is not a pallindrome");
            }
        }

}

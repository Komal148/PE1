import java.util.Scanner;

public class UnspecSum {
    public static void main(String[] args) {
        int num;
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Numbers:");

        while(input.hasNextInt())
        {
            num=input.nextInt();
            sum=sum+num;
        }
        System.out.println("Oops! You didn't enter an Integer Number.\n");
        System.out.println("Sum = "+sum);

    }

}

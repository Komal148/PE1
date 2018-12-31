import java.util.Scanner;

public class OriginalNum {


    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number:");

        while (input.hasNextInt()) {
            num = input.nextInt();
            if( num >=1 && num <= 100 )
            {
                System.out.println("Number guessed matches the original number" );
                break;
            }
            else if( num <=1 )
            {
                System.out.println("Number guessed is less than the original number" );
            }
            else
            {
                System.out.println("Number guessed is more than the original number" );
            }
        }

    }
}

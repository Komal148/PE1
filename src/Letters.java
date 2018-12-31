import java.util.Scanner;

public class Letters {

    public static void main(String[] args) {
        char c;
        Scanner input=new Scanner(System.in);
        c =input.next().charAt(0);
        if( c >=65 && c <= 90 )
        {
            System.out.println("Capital Letter");
        }
        else if( c >=97 && c <= 122 )
        {
            System.out.println("Small Letter");
        }
        else if( c >= 48 && c <= 57 )
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Symbol");
        }

    }
}
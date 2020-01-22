import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be reversed = ");
        int number = sc.nextInt();
        sc.close();
        int reverse = 0;
        int remainder = 0;
        while(number != 0)
        {
            remainder = number % 10;
            // System.out.println("remainder = "+remainder);
            reverse = reverse * 10 + remainder;
            // System.out.println("reverse = "+reverse);
            number = number / 10;
            // System.out.println("number = "+number);
            
        }
        System.out.println(reverse);
    }
}

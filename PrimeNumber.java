import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String args[])
    {
        boolean isPrime = true;
        System.out.print("Number = ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
	sc.close();
        for ( int i = 2; i < number / 2; i++)
        {
            if(number % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}

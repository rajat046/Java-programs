import java.util.Scanner;

public class Remainder
{
  public static void main (String[]args)
  {
    System.out.print("Enter Number = ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    while(number > 0)
    {
        number = number % 10;
        System.out.println(number);
        number = number / 10;
    }
  }
}

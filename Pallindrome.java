import java.util.Scanner;

public class Pallindrome
{
  public static void main (String[]args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number = ");
      int number = sc.nextInt();
      sc.close();
      int original = number;
      int reverse = 0;
      int remainder = 0;
      while(number != 0)
      {
          remainder = number % 10;
          reverse = reverse * 10 + remainder;
          number = number / 10;
      }
      if(original == reverse)
        System.out.println(original + " is Pallindrome");
      else    
        System.out.println(original + " is not Pallindrome");
    }
}

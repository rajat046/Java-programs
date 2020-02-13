import java.util.Scanner;

public class StringEvenOdd
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter String = ");
    String S = scan.nextLine();
    scan.close();
    int length = S.length();
    //System.out.println(length);
    for(int i = 0; i < length; i++)
    {
        if(i % 2 == 0)
            System.out.println("Even = "+S.charAt(i));
        else
            System.out.println("Odd = "+S.charAt(i));
    }
  }
}

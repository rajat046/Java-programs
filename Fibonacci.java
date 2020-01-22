import java.util.Scanner;

public class Fibonacci
{
  public static void main (String[]args)
  {
    System.out.print("Enter number = ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    sc.close();
    int n1 = 0;
    int n2 = 1;
    int n3;
    System.out.print(n1+" "+n2);
    
   
    for(int i = 0; i <= number; i++)
    {
        n3 = n2 + n1;
        System.out.print(" "+n3);
        n1 = n2;
        n2 = n3;
    }
  }
}

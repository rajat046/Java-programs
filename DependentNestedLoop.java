import java.util.Scanner;

public class DependentNestedLoop
{
  public static void main (String args[])
  {
      System.out.print("Enter n = ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.println("i = " +i+ " j = " +j);
            }
        }
    }
}

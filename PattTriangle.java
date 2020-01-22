public class PattTriangle
{
  public static void main (String[]args)
  {
        for(int i = 0; i <= 10; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("+ " + " ");
            }
            System.out.println();
        }
        for (int k = 9; k >= 0; k--)
        {
            for(int a = 0; a <= k; a++)
            {
                System.out.print("+ " + " ");
            }
            System.out.println();
        }
  }
}

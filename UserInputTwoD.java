import java.util.Scanner;

public class UserInputTwoD
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rows and columns = ");
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int[][] arr = new int[rows][columns];
	System.out.println();
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Displaying data = ");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
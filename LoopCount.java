import java.util.Scanner;

class LoopCount
{
    
    public static void main(String args[])
    {
        System.out.print("Enter how many times you want to run the loop = ");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
    }
}

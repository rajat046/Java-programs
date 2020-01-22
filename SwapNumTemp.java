import java.util.Scanner;

public class SwapNumTemp
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
	sc.close();
        
        int temp = 0;
        
        System.out.println("Before Swapping: a = " +a+ " b = " +b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After Swapping: a = " +a+ " b = "+b);
    }
}
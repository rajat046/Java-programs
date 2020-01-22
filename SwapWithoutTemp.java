import java.util.Scanner;

public class SwapWithoutTemp
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a = ");
		int a = sc.nextInt();
		System.out.print("Enter b = ");
		int b = sc.nextInt();
		sc.close();
		
		System.out.println("Numbers before Swapping: a = " +a+ " b = "+b);
		
		int A = a + b;
		a = A - a;
		b = A - b;
		
		System.out.println("Numbers after Swapping: a = " +a+ " b = "+b);
		
	}
}

import java.util.Scanner;

public class DecToBin
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter decimal number = ");
		int n = scan.nextInt();
		int i = 0;
		int bin[] = new int[10];
		while(n != 0)
		{
		    bin[i] = n % 2;
		    n = n / 2;
		    i++;
		}
		System.out.print("Binary value = ");
		for(int j = i - 1; j >= 0; j--)
		{
		    System.out.print(bin[j]);
		}
	}
}

import java.util.Scanner;

class Scan
{
	public static void main(String[] args) 
	{
		int i;
		float f;
		
		System.out.println("Enter values = ");
		
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println("Integer = "+i);
		
		f = sc.nextFloat();
		System.out.println("Float = "+f);
		sc.close();
	}
}

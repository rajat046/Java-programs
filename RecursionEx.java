import java.util.Scanner;

public class RecursionEx
{
    static void foo(int n)
    {
        if(n < 1)	//base condition
            return;
        else
            foo(n - 1);
            System.out.println("Hello " + n);
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    foo(n);
	}
}

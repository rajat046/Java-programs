import java.util.Scanner;

public class String_StringLength
{
    String s;
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter String = ");
	    String s = sc.nextLine();
	    int length = s.length();
	    sc.close();
	    System.out.println("The String you entered = "+s);
	    System.out.println("String Length = "+length);
		
	}
}
import java.util.Scanner;

public class ReverseString
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to be reversed = ");
        String name = sc.nextLine();
        sc.close();
        int length = name.length();
        String reverse = "";
        for(int i = length-1; i >= 0; i--)
        {
            reverse = reverse + name.charAt(i);
        }
        System.out.print("Reverse of the string = "+reverse);       
    }
}

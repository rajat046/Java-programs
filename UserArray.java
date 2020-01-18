import java.util.Scanner;

public class UserArray
{
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements = ");
        int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i = 0; i < n; i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    System.out.println("values in array = ");
	    for(int j = 0; j < arr.length; j++)
	    {
	        System.out.print(arr[j] + " ");
	    }
	    sc.close();
	}
}

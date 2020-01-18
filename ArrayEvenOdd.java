public class ArrayEvenOdd
{
	public static void main(String[] args) {
	    int arr[] = {5, 10, 15, 20};
	    for(int i = 0; i < 4; i++)
	    {
	        if(arr[i] % 2 == 0)
	        {
	            System.out.println("even number = "+arr[i]);
	        }else{
	            System.out.println("odd number = "+arr[i]);
	        }
	    }
	}
}

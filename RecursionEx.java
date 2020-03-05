public class RecursionEx
{
    public void foo(int n){
        if(n < 1){
            return;
        }
        else{
            foo(n - 1);
            System.out.println("Hello " + n);
        }
    }
	public static void main(String[] args) {
	    Main obj = new Main();
	    obj.foo(3);
	}
}

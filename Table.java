import java.util.Scanner;
class Tab{
	public static void main(String args[]){
		int a, i, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		a = sc.nextInt();
		for(i = 1; i < 10001; i++){
			t = a * i;
			System.out.println(a+ " * " +i+ " = " +t);
			}
		sc.close();
		}
	}

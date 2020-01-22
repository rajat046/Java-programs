import java.util.Scanner;

class Average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum;
        int average;
        sum = a + b;
        average = sum/2;
        
        System.out.println("Average = "+average);
    }
}

import java.util.Scanner;

class Average{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum;
        int average;
        sum = a + b;
        average = sum/2;
        sc.close();
        System.out.println("Average = "+average);
    }
}

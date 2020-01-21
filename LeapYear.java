import java.util.Scanner;

public class LeapYear
{
    public static void main(String args[])
    {
        System.out.print("Enter year = ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeap = false;
        sc.close();
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                    isLeap = true;
                else    
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else    
            isLeap = false;
        
        if(isLeap == true)
            System.out.println("Leap");
        else
            System.out.println("Not Leap");
    }
}
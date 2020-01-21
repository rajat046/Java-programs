import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile 
{
    public static void main(String[] args) 
    {
      String line;
      System.out.print("Enter Strings = ");
      Scanner sc = new Scanner(System.in);
      int counter = 1;
      int number = 1;
      while(sc.hasNextLine())
      {
        line = sc.nextLine();
        System.out.println(number+ " " +line);
        number++;
        counter++; 
      }
        sc.close();
    }
}


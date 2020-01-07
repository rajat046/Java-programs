import java.util.Scanner;

class Currency{
    public static void main(String args[]){
    int v_10, n_10, p_10, v_20, n_20, p_20, v_50, n_50, p_50, v_100, n_100, p_100, v_200, n_200, p_200, v_500, n_500, p_500, v_2000, n_2000, p_2000, final_result;
    Scanner currency = new Scanner(System.in);
    System.out.println("Denomination of notes (10)");
    v_10 = 10;
    System.out.println("How many notes do you have? = ");
    n_10 = currency.nextInt();
    p_10 = v_10 * n_10;
        //System.out.println("Result = " +cr);
    System.out.println("Denomination of notes (20)");
    v_20 = 20;
    System.out.print("How many notes do you have? = ");
    n_20 = currency.nextInt();
    p_20 = v_20 * n_20;
        //System.out.println("Result = " +fr);
    System.out.println("Denomination of notes (50)");
    v_50 = 50;
    System.out.print("How many notes do you have? = ");
    n_50 = currency.nextInt();
    p_50 = v_50 * n_50;
        //System.out.println("Result = " +ir);
    System.out.println("Denomination of notes (100)");
    v_100 = 100;
    System.out.print("How many notes do you have? = ");
    n_100 = currency.nextInt();
    p_100 = v_100 * n_100;
        //System.out.println("Result = " +lr);
    System.out.println("Denomination of notes (200)");
    v_200 = 200;
    System.out.print("How many notes do you have? = ");
    n_200 = currency.nextInt();
    p_200 = v_200 * n_200;
        //System.out.println("Result = " +or);
    System.out.println("Denomination of notes (500)");
    v_500 = 500;
    System.out.print("How many notes do you have? = ");
    n_500 = currency.nextInt();
    p_500 = v_500 * n_500;
        //System.out.println("Result = " +rr);
    System.out.println("Denomination of notes (2000)");
    v_2000 = 2000;
    System.out.print("How many notes do you have? = ");
    n_2000 = currency.nextInt();
    p_2000 = v_2000 * n_2000;
        //System.out.println("Result = " +ur);
    final_result = p_10 + p_20 + p_50 + p_100 + p_200 + p_500 + p_2000;
     currency.close();
    System.out.print("Final Result = "+p_10+" + "+p_20+" +  "+p_50+" + "+p_100+" + "+p_200+" + "+p_500+" + "+p_2000+" = " +final_result);

    }
}

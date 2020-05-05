public class MethodO
{
    void show(int a)
    {
        System.out.print("1 ");
    }
    void show(int a, int b)
    {
        System.out.print("2");
    }
    public static void main(String args[])
    {
        MethodO m = new MethodO();
        m.show(5);
        m.show(5, 6);
    }
}
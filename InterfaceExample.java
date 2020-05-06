interface I1
{
    public void show();
}
interface I2  
{
    public void display();
}
class InterfaceExample implements I1, I2
{
    public void show()
    {
        System.out.println("1");
    }
    public void display()
    {
        System.out.println("2");
    }
    public static void main(String[] args)
    {
        InterfaceExample m = new InterfaceExample();
        m.show();
        m.display();
    }
}
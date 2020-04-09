class A
{
    public static void showA()
    {
        System.out.println("showA");
    }
}
class B extends A
{
    public static void showB()
    {
        System.out.println("showB");
    }
}
class Inheritance extends B
{
    public static void showMain()
    {
        System.out.println("showMain");
    }
    public static void main(String args[])
    {
        A a = new A();
        a.showA();
        
        B b = new B();
        b.showA();
        b.showB();
        
        Main m = new Main();
        m.showA();
        m.showB();
        m.showMain();
    }
}
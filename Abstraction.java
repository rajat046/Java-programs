abstract class Abstraction
{
    abstract void start();
}
class Car extends Abstraction{
    void start()
    {
        System.out.println("key");
    }
}
class Main extends Abstraction
{
    void start()
    {
        System.out.println("kick");
    }
    public static void main(String[] args)
    {
        Car c = new Car();
        Main m = new Main();
        c.start();
        m.start();
    }
}
public class Bicycle {
    public static void main(String[] args) {
        System.out.println("Hello");
        Bicycle bike = new Bicycle(24,"jennis",4);
        bike.printmyvalues();
    }

    public  Bicycle(int x,String y,int z) {
        a=x;
        name=y;
        b=z;
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        System.out.println("Bye");



    }
    public  Bicycle(int a)
    {
        System.out.println("my test");
    }
    public void printmyvalues()
    {

    }

    public
    int a;
    String name;
    int b;
}

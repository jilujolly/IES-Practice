//abstract class and methods
public class AbDemo {
    public static void main(String[]args){
        phone obj=new Nokia();                   //cannot instantiate abstract class
        obj.call();
        obj.move();
        obj.run();
        obj.dance();

    }
}

abstract class phone{
    public void call(){
        System.out.println("calling");
    }
    public abstract void move();
    public abstract void dance();
    public  abstract void run();
}

abstract class Iphone extends phone{
    public void dance(){
        System.out.println("dancing");
        }
        }

        class Nokia extends Iphone {
    public void move() {
        System.out.println("moving");
    }

    public void run() {
        System.out.println("running");
    }
}


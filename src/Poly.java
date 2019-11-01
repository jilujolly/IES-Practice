public class Poly {
    public static void main(String []args){
        A obj1=new A();
        B obj2=new B();
        A a;
        a=obj2;
        a.show();
        obj2.show();
        obj2.show(5);
        obj2.show(5.5);  //number/type of parameter
    }
}
//method overloading, early binding/static binding
class A{
    public void show(){
        System.out.println("Hi A");
    }
    public void show(int i){
        System.out.println("Hi Int");
    }
}

//method overriding/late binding/dynamic binding
class B extends A{
    public void show(){
        System.out.println("Hi B");
    }
    public void show(double i){
        System.out.println("Hi Double");
    }
}
public class Superdemo {
    public static void main(String[]args){
        F obj=new F();
        obj.show();

    }
}
class C{
    public C(){
        System.out.println("in C");
    }
    public C(int i){
        System.out.println("in C para");
    }

}
class D extends C {
    public D() {
        System.out.println("in D");
    }

    public D(int i) {
        super(i);
        System.out.println("in D para");
    }
}

 class E{
        int i=5;


 }

 class F extends E{
    int i=4;
    public void show(){
        System.out.println(super.i);
    }

    }



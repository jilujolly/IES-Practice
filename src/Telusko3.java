//counting the number of objects of the class
public class Telusko3 {
    static int i;
    public static void main(String[]args){
        Telusko3 obj1=new Telusko3();
        Telusko3 obj2=new Telusko3();
        Telusko3 obj3=new Telusko3();
        obj1.count();

    }
    public Telusko3(){
        i++;
    }
    public void count(){
        System.out.println(i);
    }
}

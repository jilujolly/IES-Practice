public class Thisdemo {
    public static void main(String[] args) {
        G obj = new G(5);
        G obj2 = new G(6);
        obj.show();
        obj2.show();
    }
}
class G{
   private int x;                 //instance-in class outside method
   public G(int x){               //local-inside method
       this.x=x;                   //current instance
   }
    public void show(){
        System.out.println(x);
    }

}

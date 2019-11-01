public class Interfacedemo {
    public static void main(String[]args){
        d obj=new d();
        if(obj instanceof c){
            obj.show();
        }else{
       System.out.println("need permission");}

    }
}

interface a{
    public abstract void declare();
}
interface c{
}

class b implements a,c{
    public void declare(){
        System.out.println("declaring the interface");
    }
    public void show(){
        System.out.println("Interface not accessible");
    }
    public void declare2(){
        System.out.println("declaring the interface2 ");
    }
}

class d{
    public void show(){
        System.out.println("Showing");
    }
}
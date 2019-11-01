public class Exdemo {
    public static void main(String[]args){
        int i=6;
        int j=0;
        int k=3;
        try {
            k = i / j;

        }
        catch(Exception e){
            System.out.println("Cannot divide by zero");

        }
        System.out.println(k);

    }
}

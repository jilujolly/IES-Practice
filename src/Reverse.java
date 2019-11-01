public class Reverse {
    static String revstr="";
    public static void main(String[]args){
        Reverse.rev("Jilu");
        System.out.println(revstr);
    }
    public static String rev(String s){
        for(int i=s.length()-1;i>=0;i--){
            revstr=revstr+s.charAt(i);
        }
        return revstr;
        }
    }

public class Palindrome {
    public static void main(String[]args){
        boolean flag=ispalind("");
        System.out.println(flag);

    }
    public static boolean ispalind(String S1){
        if(S1==null){
            return false;
        }
        if(S1.length()<=0){
            return false;
        }
        for(int i=0;i<S1.length()/2;i++){
            if(S1.charAt(i)!=S1.charAt(S1.length()-1-i)){
                return false;
            }
        }


        return true;
    }
}

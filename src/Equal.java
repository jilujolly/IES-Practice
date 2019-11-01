public class Equal {
    public static void main(String[]args){
        boolean flag=isEquals("I am",null);
        System.out.println(flag);

    }
    public static boolean isEquals(String S1,String S2){
        if(S1==null||S2==null) {
            return false;
        }
        if(S1.length()!=S2.length()) {
            return false;
        }
        for(int i=0;i<S1.length();i++){
            if(S1.charAt(i)!=S2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

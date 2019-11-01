public class Inherit {
    public static void main(String[]args){
        sub obj=new mul();
        System.out.println("the sum is:"+ obj.sum(2,4));
        System.out.println("the sum is:"+ obj.subtract(2,4));
    }
}
class add{                         //super
    public int sum(int i,int j){
        int result;
        result=i+j;
        return result;
    }
}
                                  //single level inheritance
class sub extends add{
    public int subtract(int i,int j){
        int result;
        result=i-j;
        return result;
    }
}
class mul extends sub{                      //multilevel inheritance
    public int multi(int i,int j){
        int result;
        result=i*j;
        return result;
    }
}
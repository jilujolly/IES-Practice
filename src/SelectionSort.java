public class SelectionSort {
    public static void main(String[]args){
        int[] Array = { 18,35,32,8,22,16,15,12,2,10,27,26,7,5 };
        Sort(Array);
        for(int elm:Array) {
            System.out.println(elm);
        }
    }
    public static int[] Sort(int[]a){
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}

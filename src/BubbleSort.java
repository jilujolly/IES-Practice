public class BubbleSort {
    public static void main(String[]args){
        int[] Array = { 18,35,32,8,22,16,15,12,2,10,27,26,7,5 };
        Sort(Array);
        for(int elm:Array) {
            System.out.println(elm);
        }

    }
        public static int[] Sort(int[] a){
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;

    }

}

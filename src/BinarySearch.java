public class BinarySearch {

    public static void main(String[]args){
        int[] intArray ={ 1,2,3,4,5,6,7,8,9,10 };
        System.out.println(Searchfor(intArray,11));

    }
    public static boolean Searchfor(int[] a,int n) {
        int L = 0;
        int R = a.length - 1;
        while (L <= R) {
           // int mid = L + (R-L)/ 2;
            int mid = (L+R)/2;
            if (a[mid] == n) {
                return true;
            } else if (a[mid] < n) {
                L = mid+1;
                R = R;
            } else{
                L = L;
                R = mid-1;
            }
        }

        return false;
    }
}

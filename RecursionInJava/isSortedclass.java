package RecursionInJava;

public class isSortedclass {
    public static boolean isSorted(int arr[] , int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] > arr[idx+1]){
            return false;
        } else {
            return isSorted(arr, idx+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,4};
        System.out.println(isSorted(arr, 0));
    }
}

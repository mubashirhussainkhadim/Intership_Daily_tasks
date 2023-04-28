package SerachAlgorithems;

public class FindElementArray {
 
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7};
        linearSearch(arr, 7 ,0 ,4);
    }
   public static int linearSearch(int arr[] , int target , int start , int end){
        if (arr.length == 0){
            return -1;
        }
        for(int i = start; i <= end; i++ ){
            int element =  arr[i];
            if (element == target){
                System.out.println("we found array at number " + element + " at index " + i) ;
                return i ;
            }
        }

        return target;
    }
}

package SerachAlgorithems;


public class FindMinimunNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,5,5,-2,1};
        System.out.println(minmum(arr));
    }
    static int minmum (int[] arr){
        int ans = arr[0];
        for( int i =1 ;i < arr.length ; i++){
          int  currValue = arr[i];
          if(currValue < ans){
            ans = currValue;
          }
        }
        return ans;
    }
}

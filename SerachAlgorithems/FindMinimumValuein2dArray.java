package SerachAlgorithems;

import java.util.Arrays;

public class FindMinimumValuein2dArray {
    public static void main(String[] args) {
        int[][] arr={{23,4,4,3},{45,33,2,22},{46,342,2,214,3,8}};
        int target = 342; 
        int[] ans =  serach2d(arr, target);
           System.out.println(Arrays.toString(ans));
    }
    static int[] serach2d(int[][] arr , int target){
        for(int row =0 ; row <arr.length; row++){
            for(int col =0 ; col <arr[row].length; col++){
                if (arr[row][col] == target){
                    return  new int[] {col,row};
                }
            }
        }
        return  new int[] {-1,-1};

    }
   
}

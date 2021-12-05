package LinearSearch;
import java.util.*;
public class MultidimArray {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11,12}
        };
        System.out.println(search(arr,11));

        System.out.println(Arrays.toString(SearchIndex(arr,11)));
    }
    static boolean search(int [][] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int [] element :arr){
            for( int ele :element){
                if(ele==target){
                    return true;
                }
            }
        }
        return false;
    }
    static int[] SearchIndex(int [][] arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

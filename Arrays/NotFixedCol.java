package Arrays;

import java.util.Arrays;

public class NotFixedCol {
    public static void main(String[] args) {
        int [][] arr={
                        {1,2,3},
                        {4,5},
                        {6,7,8,9}
                      };
        //  METHOD : 1
//        for(int row=0;row< arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        //METHOD 2
//            for(int []a:arr){
//                System.out.println(Arrays.toString(a));
//            }
        //METHOD 3
        System.out.println(Arrays.deepToString(arr));
    }
}

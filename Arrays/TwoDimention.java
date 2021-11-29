package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimention {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [][] arr=new int [3][];
        //INPUT
        for(int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col]=s.nextInt();
            }
        }
        //OUTPUT METHOD : 1

//            System.out.println(Arrays.deepToString(arr));

         //OR METHOD : 2
        for(int []a:arr){
            System.out.println(Arrays.toString(a));
        }
        //OR METHOD : 3

//        for(int row=0;row<arr.length;row++){
//            for (int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]  + " ");
//            }
//            System.out.println();
//        }

    }
}

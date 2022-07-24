package gfg.Arrays;

import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        int [] arr={1, 5, 3, 2};
        int n=4;
//        System.out.println(Arrays.toString(sortArr(arr,n)));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
//    static int[] sortArr(int[] arr, int n)
//    {
//        // code here
//        boolean swapped;
//        for(int i=0;i<n;i++){
//            swapped=false;
//            for(int j=1;j<n-i;j++){
//                if(arr[j]<arr[j-1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                    swapped=true;
//                }
//            }
//            if(!swapped){
//                break;
//            }
//        }
//        return arr;
//    }


}

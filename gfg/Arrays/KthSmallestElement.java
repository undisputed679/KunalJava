package gfg.Arrays;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        int l=6;int r=6;int k =3;
        System.out.println( kthSmallest(arr,l,r,k));

    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        Arrays.sort(arr);
        return arr[k-1];
    }
}

package gfg.Arrays;

import java.util.Arrays;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int [] arr={0,2,1,2,0};
        sort012(arr,5);
    }
    public static void sort012(int a[], int n)
    {
        // code here

       int start=0;int mid=0;int end=n-1;
        while(mid<end){
            if(a[start]==0){
                start++;
                mid++;
            }else if(a[start]==1){

            }
        }

    }
}

//class Solution
//{
//    public static void sort012(int a[], int n){
//        int low = 0, high = n-1, mid = 0;
//        while(mid <= high){
//            if(a[mid]==0) {
//                int temp=a[low];
//                a[low]=a[mid];
//                a[mid]=temp;
//                low++;
//                mid++;
//            } else if(a[mid]==1) {
//                mid++;
//            } else {
//                int temp=a[mid];
//                a[mid]=a[high];
//                a[high]=temp;
//                high--;
//            }
//        }
//    }
//}

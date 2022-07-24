package gfg.Arrays;

import java.util.Arrays;

public class MoveNegtiveToRight {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int n=8;
        segregateElements(arr,n);
    }
    public  static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int [] newarr=new int[n];
        int start=0;int end=n-1;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                newarr[start]=arr[i];
                start++;
            }
            if(start==n-1){
                System.out.println(-1);
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                newarr[start]=arr[i];
                start++;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }
//        int start=0;int end=n-1;
//        while(start<end){
//            if(arr[start]>=0){
//                start++;
//            }else if(arr[end]<0){
//                end--;
//            }else{
//                int temp=arr[start];
//                arr[start]=arr[end];
//                arr[end]=temp;
//                start++;end--;
//            }
//        }
//        System.out.println(Arrays.toString(newarr));
    }
}

package Shorting;

import java.util.Arrays;

//when array is from 1 to N
public class CyclicSort {
    public static void main(String[] args) {
        int [] arr={3,2,5,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i=0;
        while(i< arr.length){
            int correct=arr[i] - 1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

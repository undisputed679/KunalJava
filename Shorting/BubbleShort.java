package Shorting;

import java.util.Arrays;

public class BubbleShort {
    public static void main(String[] args) {
        int [] arr={5,1,2,3,4,6};
        bubbleShort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleShort(int [] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}

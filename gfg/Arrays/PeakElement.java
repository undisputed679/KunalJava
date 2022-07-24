package gfg.Arrays;

public class PeakElement {
    public static void main(String[] args) {
        int []arr={2,3,1,7,4,5,11,0};
        int n=8;
        System.out.println(peakElement(arr,n));
    }
    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        int max=arr[0];int index=0;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
}

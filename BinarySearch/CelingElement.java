package BinarySearch;

public class CelingElement {
    public static void main(String[] args) {
        int[] arr= { 1,2,4,5,7,9,11,15,17 };
        int [] ab={17,15,14,12,10,8,6,3,1};
        System.out.println(value(ab,11));
    }
    static int value(int[] arr,int target){
        int start=0;int end=arr.length-1;
        boolean asc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target==arr[mid]) return target;
            if(asc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }return arr[start];
    }
}

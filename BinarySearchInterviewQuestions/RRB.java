package BinarySearchInterviewQuestions;

public class RRB {
    public static void main(String[] args) {

    }
    static int search(int [] nums,int target){
        int mid=
        if(nums[])
    }
    static int findPivot(int [] arr){
        int start=0;int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return arr[mid];
            }
            if(arr[mid]<arr[mid-1]){
                return arr[mid-1];
            }
            else(if())
        }
    }
}

package BinarySearchInterviewQuestions;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={1,2,2,4,6};
        System.out.println(value(arr,3));
        int count=0,temp=0;
    }
    static int value(int[] arr,int target){
        if(target>arr[arr.length-1]) return -1;
        int start=0;int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return start;
        //for floor value return end;
    }
}

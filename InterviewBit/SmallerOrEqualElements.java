package InterviewBit;

public class SmallerOrEqualElements {
    public static void main(String[] args) {

    }
    static int search(int [] nums,int target){
        int start=0;int end=nums.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }return -1;
    }
}

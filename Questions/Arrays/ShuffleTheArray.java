package Questions.Arrays;
import java.util.*;
public class ShuffleTheArray {
    public static void main(String[] args) {
        int []nums = {1,1,2,2};int  n = 2;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    static  int[] shuffle(int[] nums, int n){
        if(nums.length!=2*n) return new int[]{-1};
        int [] arr=new int[nums.length];
        int start=0;int end=n;
        for(int i=0;i<nums.length;i=i+2){
            arr[i]=nums[start];
            arr[i+1]=nums[end];
            start++;end++;
        }
        return arr;
    }
}

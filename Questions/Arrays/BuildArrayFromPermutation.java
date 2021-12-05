package Questions.Arrays;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(indexvalue(nums)));
    }
    static int[] indexvalue(int [] nums){
        int[] value=new int[nums.length];
        if(nums.length==0) return new int[]{-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums.length-1 || nums[i]<0) return new int[]{-1};
            value[i]=nums[nums[i]];
        }
        return value;

    }
}

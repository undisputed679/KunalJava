package Questions.Arrays;
import java.util.*;
public class RunnningSumOF1DArray {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString( Findsum(nums)));
    }
    static int[] Findsum(int [] nums){
        int sum=0;
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}

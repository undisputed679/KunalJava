package Questions.Arrays;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        System.out.println(Arrays.toString(tofind(a)));
    }
    static int[] tofind(int [] nums){
        if(nums.length==0) return new int[]{-1};
        int [] b=new int[nums.length*2];
        for(int i=0;i<b.length;i++){
            if(i<nums.length){
                b[i]=nums[i];
            }
            else{
                b[i]=nums[i-nums.length];
            }
        }
        return b;
    }
}

package Questions.Arrays;

public class NumberOFGoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(goodpair(nums));
    }
    static int goodpair(int [] nums){
        int count=0;
        if(nums.length==0) return -1;
        for(int i=0;i< nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        } return count;
    }
}

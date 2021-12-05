package LeetCode;

public class FindEvenNumbers {
    public static void main(String [] args){
        int [] arr={555,901,482,1771,0};
        System.out.println(Even(arr));
    }
    static int Even(int [] arr){
        if (arr.length==0) return -1;
        int count=0;
        for(int nums:arr){
            if((countnums(nums))%2==0){
                count++;
            }
        }
        return count;
//        or
//        return (int)(Math.log10(nums))+1;
    }
    static int countnums(int nums){
        int count=0;
        if(nums<0) nums=nums*-1;
        while(nums>0){
            nums=nums/10;
            count++;
        }
        return count;
    }
}

package gfg;

import java.util.ArrayList;

public class subarray {
    public static void main(String[] args) {
        int N = 6; int S = 33;
        int[]A = {1,4,20,3,10,5};
        System.out.println(subarraySum(A,N,S));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum>s) break;
                else if(sum==s) {
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }
            }
            sum=0;
        }list.add(-1);
        return list;    }
}

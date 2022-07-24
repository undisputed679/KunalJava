package gfg.Arrays;

import java.util.ArrayList;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        int n=5;
        int s=5;
       int  arr[] = {1,2,13,7,5};
        System.out.println(subarraySum(arr,n,s));

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=arr[i];
            for(int j=i+1;j<=n;j++){
                if(sum==s){
                    list.add(i+1);
                    list.add(j);
                    return list;
                }
                if(sum>s|| j==n){
                    break;
                }
                sum+=arr[j];

//                if(sum==s ){
//                    list.add(i+1);
//                    list.add(j+1);
//                    return list;
//                }else if (sum>s){
//                    break;
//                }

            }
        }
//        if(arr[n-1]==s){
//            list.add(n);list.add(n);
//        }else{
//            list.add(-1);
//        }
        list.add(-1);

        return list ;

    }
}

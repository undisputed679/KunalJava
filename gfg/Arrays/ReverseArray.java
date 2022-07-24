package gfg.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int test=s.nextInt();
        for(int i=0;i<test;i++){
            int size=s.nextInt();
            int [] arr=new int[size];
            for(int j=size-1;j>=0;j--){
                arr[j]=s.nextInt();

            }
            System.out.println(Arrays.toString(arr));
            System.out.println("");
        }
    }
}

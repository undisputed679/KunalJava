package Questions.Loops;

import java.util.Scanner;

public class WhileLargest {
    //Take integer inputs till the user enters 0 and print the largest number from all.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        while(true){
            int k=sc.nextInt();
            if(k>max){
                max=k;
            }else{
                if(k==0) {
                    System.out.println(max);
                    break;
                }
            }


        }
    }
}

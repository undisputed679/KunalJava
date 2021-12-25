package Questions.Loops;

import java.util.Scanner;

public class SumAndProductDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(value(sc.nextInt()));
    }
    static int value(int n){
        Scanner sc=new Scanner(System.in);
        int sum=0,product=1;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n=n/10;

        }
        return(product-sum);
    }
}

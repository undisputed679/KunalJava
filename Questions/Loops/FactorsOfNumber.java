package Questions.Loops;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        value(sc.nextInt());
    }
    static void value(int num){
        for(int i=1;i<=num/2;i++){
            if(num%i==0) System.out.println(i);

        }
        System.out.println(num);

    }
}

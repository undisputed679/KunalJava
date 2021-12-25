package Questions.Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();int value=1;
        for(int i=1;i<=k;i++){
            value*=i;
        }
        System.out.println(value);
    }
}

package Questions.FirstJava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(check(num));
    }
    static boolean check(int num){
       return num%2==0;
    }
}

package Questions.FirstJava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int v=sc.nextInt();
        char c=sc.next().charAt(0);
        if(c=='+'){
            System.out.println(t+v);
        }else if(c=='-'){
            System.out.println(t-v);
        }
        else if(c=='*'){
            System.out.println(t*v);
        }
    }
}

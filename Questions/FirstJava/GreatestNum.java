package Questions.FirstJava;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a);
        }else if(a==b){
            System.out.println("equal");
        }
        else{
            System.out.println(b);
        }
    }
}

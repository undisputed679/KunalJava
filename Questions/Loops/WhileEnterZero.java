package Questions.Loops;

import java.util.Scanner;

public class WhileEnterZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            int k=sc.nextInt();
            if(k==0){
                System.out.println(sum);
                break;
            }
            else {
                sum+=k;
            }
        }
    }
}

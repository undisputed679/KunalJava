package Questions.Loops;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        //nCr = n!/(r!*(n-r)!)
        //nPr = n!/(n-r)!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int r=sc.nextInt();
        System.out.println((factorial(n)/(factorial(r)*factorial(n-r))));
        System.out.println(factorial(n)/factorial(n-r));
    }
    static int factorial(int n){
        int k=n;int value=1;
        for(int i=1;i<=k;i++){
            value*=i;
        }
        return value;
    }
}

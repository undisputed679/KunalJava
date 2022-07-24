package Questions.FirstJava;

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){

            System.out.println(value(sc.nextInt()));
        }
        sc.close();
    }
    static int value(int num){
        int count=0;
        while(num>0){
            if(num%10==4){
                count++;
            }
            num/=10;
        }
        return count;
    }
}
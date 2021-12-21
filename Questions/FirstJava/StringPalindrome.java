package Questions.FirstJava;

import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(isPalindrome(input.nextLine()));
        input.close();

    }
    public static boolean isPalindrome(String str){
        for(int i=0; i<(str.length())/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }
}
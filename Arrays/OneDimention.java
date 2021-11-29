package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimention {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] arr= new int [3];
        for(int i=0;i<3;i++){
            arr[i]=s.nextInt();
        }
            System.out.println(Arrays.toString(arr));
    }
}

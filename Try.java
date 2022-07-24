
import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        int []nums = {3,0,1};
        System.out.println(value(nums));
    }
    static int value(int [] arr){
        for (  int i = 0; i < arr.length; i++) {
            if(arr[i]< arr.length-1 && arr[i]!=i){
               swap(arr,arr[i],arr[arr[i]]);
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

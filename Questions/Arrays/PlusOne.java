package Questions.Arrays;

public class PlusOne {
    public static void main(String[] args) {

    }
    static int array(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        sum=sum++;
        return 0;
    }
}

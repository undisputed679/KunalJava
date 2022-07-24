package BitwiseOperators;

public class UniqueNumberInArray {
    public static void main(String[] args) {
        int [] arr={1,2,1,3,4,2,5,6,5,6,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique=0;
        for(int num:arr){
            unique^=num;
        }
        return unique;
    }
}

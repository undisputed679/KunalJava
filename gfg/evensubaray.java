package gfg;

public class evensubaray {
    public static void main(String[] args) {
        int [] arr={0,0};
        System.out.println(find(arr));
    }
    static boolean find(int [] arr){
        for(int i=0;i<arr.length-1;i=i+2){
            if(arr[i]+arr[i+1]!=0){
                return false;
            }
        }
        return true;
    }
}

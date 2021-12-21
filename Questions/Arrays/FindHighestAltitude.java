package Questions.Arrays;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int []gain = {-5,1,5,0,-7};
        System.out.println(max(gain));
    }
    static int max(int[]gain){
        int [] maxelement=new int[gain.length+1];
        int sum=0;maxelement[0]=0;
        for(int i=0;i< gain.length;i++){
            maxelement[i+1]=sum+gain[i];
            sum+=gain[i];
        }
        return Maximum(maxelement);
    }
    static int Maximum(int [] arr){
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
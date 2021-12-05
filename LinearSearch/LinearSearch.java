package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={2,14,18,5,19,29};
        int target=11;
        System.out.println(search(arr,target));

    }
    public static int search(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

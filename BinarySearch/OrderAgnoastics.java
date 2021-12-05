package BinarySearch;

public class OrderAgnoastics {
    public static void main(String[] args) {
        // int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22,17,17,17,17,17, 11, 10, 5, 2, -3};
        int target = 17;
        System.out.println(orderagnosticsBs(arr,target));

    }
    static int orderagnosticsBs(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean Asc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            if(Asc){
                if(arr[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }return -1;
    }

}

package LinearSearch;

public class MaxElement {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3},
                {4,5,96,7},
                {8,9,10,11,12}
        };
        System.out.println(maxvalue(arr));
    }
    static int maxvalue(int [][] arr){
        int max=arr[0][0];
        if(arr.length==0){
            return -1;
        }
        for(int[] value:arr){
            for(int element:value){
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }

}

//package InterviewBit.Arrays;
//
//import java.util.ArrayList;
//
//public class MaxNonNegativeSubArray {
//    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(5);
//        list.add(-7);
//        list.add(2);
//        list.add(3);
//
//
//    }
//
//    static ArrayList<Integer> maxset(ArrayList<Integer> A) {
//        ArrayList<Integer> list=new ArrayList<>();
//        int sum=0;
//        for(int i=0;i< A.size()-1;i++){
//            if(A.get(i)>=0){
//                if(A.get(i)>sum){
//                    sum=A.get(i);
//                }
//                int start=i;
//                list.add(A.get(i));
//            }else{
//                break;
//            }
//            for(int j=0;j< A.size();j++){
//                if(A.get(j)<0){
//                    sum=0;
//                    list
//                }
//                sum+=A.get(j);
//                int end =j;
//            }
//        }
//        return maxset();
//    }
//
//
//}

package InterviewBit;

public class PickFromBothSide {
    public static void main(String[] args) {
        int [] A = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
        int B = 48;
        System.out.println(solve(A,B));
    }
    public static int solve(int[] A, int B) {
        int start=0;int end=A.length-1;
        int count=0;int sum=0;
        while(count<B){
            if(A[start]>A[end]){
                sum+=A[start];
                start+=1;
                count+=1;
            }
            else if(A[end]>A[start]){
                sum+=A[end];
                end-=1;
                count+=1;
            }
            else{
                sum+=A[end];
                count+=1;
                end-=1;
                start+=1;
            }
        }
        System.out.println(count);
        return sum;

    }
}

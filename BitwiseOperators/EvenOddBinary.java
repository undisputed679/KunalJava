package BitwiseOperators;

public class EvenOddBinary {
    public static void main(String[] args) {
        int n=31;
        System.out.println(isOdd(n));

    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}

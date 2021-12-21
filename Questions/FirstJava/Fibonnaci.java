package Questions.FirstJava;

public class Fibonnaci {
    public static void main(String[] args) {
        int n=5;
        int a=0;int b=1;
        for(int i=0;i<n;i++){

            System.out.print(a+" ");
            System.out.print(b+" ");
            int c=a+b;
            System.out.print(c+" ");

            a=b;b=c;
        }
    }
}

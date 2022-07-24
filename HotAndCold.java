import java.util.ArrayList;
import java.util.Scanner;

public class HotAndCold {
    public static void main(String[] args) {
        int hotnum=54;

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=0;
        while(n>=0){
            n=sc.nextInt();
            list.add(sc.nextInt());
        }

        for(int i=0;i< list.size();i++){
            if(list.get(i)<54 && list.get(i)%9==0){
                System.out.println(-9);
            }
            else if(list.get(i)<54){
                System.out.println(-6);
            }
            else if(list.get(i)%9==0){
                System.out.println(-5);
            }
        }
    }
}

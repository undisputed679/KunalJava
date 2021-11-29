package ArrayList;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
//        list.add(43);
//        list.add(346);
//        list.add(56);
//        list.add(976);
//        list.add(68);
//        list.set(0,123);
        //  INPUT
        for(int i=0;i<5;i++){
            list.add(s.nextInt());
        }
        // OUTPUT
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//pass index here
        }
        System.out.println(list);
    }
}

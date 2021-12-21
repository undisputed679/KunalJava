package Questions.Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithLargestNumberOfCandies {
    public static void main(String[] args) {
        int []candies = {2,3,5,1,3}; int extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList<Boolean> list=new ArrayList<>();
        int max=0;
        for(int element:candies){
            if(element+extraCandies>max){
                max=element+extraCandies;
                list.add(true);
            }
            else list.add(false);

        }
        return list;
    }

}

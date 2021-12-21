package Questions.Arrays;

public class RichestCustomerWealth {
        public static void main(String[] args) {
            int [][] accounts = {{6,59,64,19,30,76,71,86,90,25,56,17,19,72,61,56,24,40,35,39,67,28,52,11,82,72,8,82,81,47}};
            System.out.println(richest(accounts));
        }
        static int richest(int [][] arr){
            int max=0;
            if (arr.length==0) return -1;
            for(int [] person:arr){
                int sum=0;
                for(int total:person){
                    sum+=total;
                }
                if(max<sum) {
                    max=sum;
                    System.out.println(max);
                }
            }
            return max;
        }
    }



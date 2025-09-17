package raghusir;

import java.util.Arrays;

public class SequenceNumber {
    public static void main(String[] args) {
        int[] num = {3,6,4,2,1,7,9};
        int n = num.length-1;
        Arrays.sort(num);
       for(int i=0; i<n; i++){
           if(num[i]+1 != num[i+1]){
               System.out.println(num[i]+1);

           }
       }
    }
}

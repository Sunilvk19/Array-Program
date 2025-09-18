package raghusir;

import java.util.Arrays;

public class InsertingSpecifiedEle {
    static int[] insertSpecified(int[] x,int in, int value){
       if(in<0 || in > x.length){
           System.out.println("Index is not in Range.");
       }
       int[] y = new int[x.length + 1];
       for(int i=0; i< in; i++){
           y[i] = x[i];
       }
       y[in]= value;
       for(int i=in;i<x.length;i++){
           y[i + 1] = x[i];
       }
       return y;
    }

    public static void main(String[] args) {
        int[] ab = {2,3,6,9};
        int ar = 7;
        int in = 4;

        System.out.println(Arrays.toString(insertSpecified(ab,in,ar)));
    }
}

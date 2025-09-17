package raghusir;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] ar = {1,2,3};
        int[] ar1 = {4,5,6};

        int[] arr = new int[ar.length + ar1.length];

        for(int i=0; i<ar.length; i++){
            arr[i] = ar[i];
        }
        for (int i=0; i<ar1.length; i++){
            arr[i+ar.length] = ar1[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}

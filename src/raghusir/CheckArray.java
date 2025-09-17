package raghusir;

import java.util.Arrays;

public class CheckArray {
    public static void main(String[] args) {
        int[] ar1 = {1,2,3,4};
        int[] ar2 = {3,4,5,6};
        if(Arrays.equals(ar1, ar2)){
            System.out.println("Two Arrays Equal");
        }else{
            System.out.println("Two Arrays not Equal");
        }
    }
}

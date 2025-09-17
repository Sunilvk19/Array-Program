package raghusir;

import java.util.Arrays;

public class MainArrayCopy {
    public static void main(String[] args) {
        int[] ar = {25,56,78,39,72};
       int[] br = Arrays.copyOf(ar,ar.length);
       int[] cr = ar.clone();

        System.out.println(Arrays.toString(ar));
        System.out.println("Using CopyOf: "+Arrays.toString(br));
        System.out.println("Using Clone: " +Arrays.toString(cr));
    }
}

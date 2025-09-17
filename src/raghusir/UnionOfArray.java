package raghusir;

import java.util.Arrays;

public class UnionOfArray {
    static int[] isUnionOfArray(int[] ar1, int[] ar2) {
        int[] temp = new int[ar1.length + ar2.length];


        int k = 0;
        for (int i = 0; i < ar1.length; i++) {
            temp[k++] = ar1[i];
        }

        for (int i = 0; i < ar2.length; i++) {
            boolean found = false;
            for (int j = 0; j < ar1.length; j++) {
                if (ar2[i] == ar1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[k++] = ar2[i];
            }
        }

        // Step 3: Create the final result array of the exact size
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {3,4,5};

        System.out.println("Union of Array: "+ Arrays.toString(isUnionOfArray(a,b)));
    }
}


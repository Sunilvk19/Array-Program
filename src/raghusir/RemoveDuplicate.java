package raghusir;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] ar = {1,2,2,3,4,4,5};
//        HashSet<Integer> set = new HashSet<>();
//        for(int i=0; i<ar.length; i++){
//            set.add(ar[i]);
//        }
//        set.forEach(System.out::print);


//        Arrays.sort(ar);
//        System.out.print(ar[0]);
//        for(int i=1; i<=ar.length-1; i++){
//            if(ar[i] != ar[i-1]){
//                System.out.print(ar[i]+" ");
//            }
//        }

        int[] br = new int[ar.length];
        int k =0;
        for(int i=0; i<ar.length; i++){
            int j = 0;
            for(; j<k; j++){
                if(ar[i]==br[j]) break;
            }
            if(j == k)
            {
                br[k] = ar[i];
                k++;
            }
        }
        int[] cr = new int[k];
        for(int i=0; i<k; i++){
            cr[i] = br[i];
        }
        System.out.println(Arrays.toString(cr));
    }
}

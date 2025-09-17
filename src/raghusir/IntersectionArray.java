package raghusir;

import java.util.Arrays;

public class IntersectionArray {
    static int[] intersection(int[] ar1,int[] ar2){
        int[] arr = new int[ar1.length];
        int in = 0;
        for(int i=0; i<ar1.length; i++){
            for(int j=0; j<ar2.length; j++){
                if(ar1[i]==ar2[j]){
                    arr[in]= ar1[i];
                    in++;
                    break;
                }
            }
        }
        int[] res = new int[in];
        for(int i=0; i<res.length; i++){
            res[i] = ar1[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] ar1 = {1,2,3,4};
        int[] ar2 = {3,4,5,6};
        System.out.println("Intersection: ");
        System.out.println(Arrays.toString(intersection(ar1,ar2)));
    }
}

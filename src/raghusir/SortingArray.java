package raghusir;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {4,9,1,2,8};
        String st = Arrays.toString(arr);
        System.out.println(st);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int f=0, l=arr.length-1;
        while(f<l){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package raghusir;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,9,1,2,8};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        getReverse(arr);

    }

    private static void getReverse(int[] ar) {

        for(int i=ar.length-1; i>=0; i--){
            System.out.print(ar[i]+" ");
        }
    }
}

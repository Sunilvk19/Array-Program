package raghusir;

import java.util.Scanner;

public class ArraySecLarAndSecSmall {

    public static void main(String[] args) {
        int[] ar = {10,25,3,99,45};
        getSmallAndLarge(ar);
    }

    private static void getSmallAndLarge(int[] arr) {
        int fsmall = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<fsmall){
                ssmall = fsmall;
                fsmall = arr[i];
            } else if (arr[i] < ssmall) {
                ssmall = arr[i];
            }
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] > sLargest) {
                sLargest = arr[i];
                
            }
        }
        System.out.println("Second Largest: "+sLargest);
        System.out.println("Second Smallest: "+ssmall);
    }
}

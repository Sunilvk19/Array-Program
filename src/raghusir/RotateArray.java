package raghusir;

import java.util.Arrays;

public class RotateArray {
    static void reverse(int[] arr, int f, int l){
        while (f < l) {
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
    }
    static  void rotateLeft(int[] ar,int k){
        int n = ar.length;
        k = k % n;

        reverse(ar,0,k-1);
        reverse(ar,k,n-1);
        reverse(ar,0,n-1);
    }
    static void rotateRight(int[] ar, int a){
        int n = ar.length;
        a = a % n;
        reverse(ar,0,n-1);
        reverse(ar,0,a-1);
        reverse(ar,a,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int[] leftArr = Arrays.copyOf(arr, arr.length);
        rotateLeft(leftArr, k);
        System.out.println("LeftRotation:  " + Arrays.toString(leftArr));

        int[] rightArr = Arrays.copyOf(arr, arr.length);
        rotateRight(rightArr, k);
        System.out.println("RightRotation: " + Arrays.toString(rightArr));
    }
}

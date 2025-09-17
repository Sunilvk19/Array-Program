package raghusir;

import java.util.Scanner;

public class MainArrayBig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter "+n+"value");
        for (int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        int bg = getBiggest(ar);
        System.out.println(bg);
    }

    private static int getBiggest(int[] arr) {
        int big = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > big){
                big = arr[i];
            }
        }
        return big;
    }
}

package raghusir;

import java.util.Scanner;

public class MainArraySmall {
    static int getSmallest(int[] ar){
        int small = Integer.MAX_VALUE;
        for(int i=1; i<ar.length; i++){
            if(ar[i]<small){
                small = ar[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of an array");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter "+n+"value");
        for (int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }
        int bg = getSmallest(ar);
        System.out.println(bg);
    }

}

package pro.org;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOps {
    static void printArray(int[] num){
        if(num == null){
            System.out.println("Array should not be null");
        }
        int max_ind = num.length-1;
        if(max_ind == -1){
            System.out.println("[]");
        }else {
            System.out.print("[");
            for(int i=0; i<num.length; i++){
                System.out.print(i);
                if(i == max_ind) {
                    System.out.print("]");
                }else {
                    System.out.println();
                }
            }
        }
    }
    static ArrayList<int []> splitArray(int[] arr, int ele){
        int[] spilt1 = new int[ele];
        int[] spilt2 = new int[arr.length - ele];
        for(int i=0; i<arr.length; i++){
            if(i< spilt1.length){
                spilt1[i] = arr[i];
            }else{
                spilt2[i- spilt1.length] = arr[i];
            }
        }
        ArrayList<int []> list = new ArrayList<>();
        list.add(spilt1);
        list.add(spilt2);
        return list;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<int[]> result = ArrayOps.splitArray(arr,4);
        for(int[] arrays : result){
            ArrayOps.printArray(arrays);
        }
    }
}

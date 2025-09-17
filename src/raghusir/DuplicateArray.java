package raghusir;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] ar = {2,5,7,2,9,5};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int num : ar){
            if(!set.add(num)){
                duplicate.add(num);
            }
        }
        System.out.println("Duplicate are: "+duplicate);
    }
}

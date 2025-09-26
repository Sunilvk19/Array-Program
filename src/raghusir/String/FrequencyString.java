package raghusir.String;

import java.util.Arrays;

public class FrequencyString {
    static void isFrequency(String str){
        int[] cha = new int[128];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            cha[ch]++;
        }
        for(int i=0; i<cha.length; i++){
            if(cha[i] != 0)
                System.out.println((char)i+"->"+cha[i]);
        }

    }

    public static void main(String[] args) {
        String st = "Programming";

        isFrequency(st);
    }
}

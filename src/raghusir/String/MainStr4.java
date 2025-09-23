package raghusir.String;

import java.util.Scanner;

public class MainStr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        int vc =0, cc=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'A' ||ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vc++;
            }else{
                cc++;
            }
        }
        System.out.println("Count of Vowel: "+vc);
        System.out.println("Count of Con: "+cc);
    }
}

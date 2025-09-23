package raghusir.String;

import java.util.Scanner;

public class MainStr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        int splo = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!(ch>='A' && ch<='Z' || ch>='a' && ch<='z'|| ch>='0' && ch <='9')){
                splo++;
            }
        }
        System.out.println("Special String: "+splo);
    }
}

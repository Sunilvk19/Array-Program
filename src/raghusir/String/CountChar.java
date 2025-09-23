package raghusir.String;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String st = sc.nextLine();
        int uc = 0, lc = 0;
        for(int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch>='A' && ch<='Z')
                uc++;
            else if (ch>='a' && ch<='z') {
                lc++;
            }
        }
        System.out.println("Number of capital letters: "+uc);
        System.out.println("Number of small letters: "+lc);
    }
}

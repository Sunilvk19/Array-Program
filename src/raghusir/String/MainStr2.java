package raghusir.String;

import java.util.Scanner;

public class MainStr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String st = sc.nextLine();
        int alp=0,dig=0,sch=0;
        for(int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
                alp++;
            } else if(ch>='0' && ch <='9'){
                dig++;
            }else {
                sch++;
            }
        }
        System.out.println("Number of Alphabets: "+alp);
        System.out.println("Number of digit: "+dig);
        System.out.println("Number of specialChar: "+sch);
    }
}

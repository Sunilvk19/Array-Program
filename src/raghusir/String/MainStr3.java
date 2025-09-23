package raghusir.String;

import java.util.Scanner;

public class MainStr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        System.out.println("Enter Character: ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char cha = str.charAt(i);
            if(ch == cha){
                count++;
            }else{
                System.out.println("No Such Character.");
                break;
            }
        }
        System.out.println(ch+" Number of character is: "+count);
    }
}

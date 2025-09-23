package raghusir.String;

import java.util.Scanner;

public class MainStr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }
        System.out.println("Sum of digit in String: "+sum);
    }
}

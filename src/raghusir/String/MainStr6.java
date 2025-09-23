package raghusir.String;

import java.util.Scanner;

public class MainStr6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scan.next();
        System.out.println("Enter Specified Char: ");
        char ch = scan.next().charAt(0);
        boolean present = false;
        int in = -1;
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)== ch){
                present = true;
                in = i;
                break;
            }else{
                present = false;
            }
        }
        if(!present){
            System.out.println("Specified char not found: ");
        }else{
            System.out.println("Specified char is found: "+in);
        }
    }
}

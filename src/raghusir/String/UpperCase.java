package raghusir.String;

public class UpperCase {
    static String toCapital(String str){
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]>='a' && ch[i]<='z')
                ch[i] = (char)(ch[i]-32);
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "Ramesh";
        String st = toCapital(str);
        System.out.println(st);
    }
}

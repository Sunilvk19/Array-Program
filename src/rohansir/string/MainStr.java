package rohansir.string;

public class MainStr {
    public static void main(String[] args) {
        String st1 = new String("pen");
        String st2 = "pen";
        System.out.println(st1 == st2); // false
        System.out.println(st1.equals(st2));//true

        System.out.println("------------------");

        String s1 = new String("car");
        String s2 = new String("car");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println("---------------");

        String a1 = new String("HP");
        String b1 = a1;
        String c1 = b1;
        System.out.println(a1 == b1);//true
        System.out.println(b1.equals(c1));//true

        System.out.println("----------------------");

        String a = "AB";
        String b = "A";
        String c = b + "B";
        System.out.println(a == c);//false
        System.out.println(a.equals(c));//false
    }

}

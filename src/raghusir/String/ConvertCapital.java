package raghusir.String;

public class ConvertCapital {
    static String toConvert(String st){
        char[] cha = st.toCharArray();
        for(int i=0; i< cha.length; i++){
            if(cha[i]>='A' && cha[i]<='Z') {
                if (cha[i] != 'A' && cha[i] != 'E' && cha[i] != 'O' && cha[i] != 'U') {
                    cha[i] = (char) (cha[i] + 32);
                }
            } else if (cha[i] >= 'a' && cha[i] <= 'z') {
                if (cha[i] == 'a' || cha[i] == 'e' || cha[i] == 'o' || cha[i] == 'u'){
                    cha[i] = (char) (cha[i] - 32);
                }
            }
        }
        return new String(cha);
    }

    public static void main(String[] args) {
        String str = "Mahadev";
        String st = toConvert(str);
        System.out.println(st);
    }
}

package raghusir;

public class ArraySearching {
    public static void main(String[] args) {
        int[] cr = {};
        int ele = 78, in = -1;
        for(int i=0; i<cr.length; i++){
            if(cr[i]==ele){
                in = i;
                break;
            }
        }
        if(in != -1){
            System.out.println(ele+"present at "+in);
        }else{
            System.out.println("Element is not present");
        }
    }
}

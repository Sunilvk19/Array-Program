package raghusir;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] ar = {10,20,10,30,20,10,30,50};
        boolean[] br = new boolean[ar.length];
        for(int i=0; i<ar.length; i++) {
            if (!br[i]) {
                int count = 1;
                for (int j = i + 1; j < ar.length; j++) {
                    if(ar[i] == ar[j]) {
                        count++;
                        br[j] = true;
                    }
                }
                System.out.println(ar[i]+" -> "+count+" Time");
            }
        }
    }
}

package raghusir;

public class ParticularNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2};
        int element = 2;
        int count = 0;
        for (int num : arr){
            if(num == element){
                count++;
            }
        }
        System.out.println("Element  "+element + " occurs "+ count + " time");
    }
}

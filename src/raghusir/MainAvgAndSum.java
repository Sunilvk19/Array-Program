package raghusir;

public class MainAvgAndSum {
    public static void main(String[] args) {
        int[] ar = {5,10,15,20};
        int sum = 0;
        for (int i=0; i<ar.length; i++){
             sum = sum + ar[i];
        }
        double avg = (double) sum / ar.length;
        System.out.println("Sum of the Array is: "+sum);
        System.out.println("Average of the Array is: "+avg);
    }
}

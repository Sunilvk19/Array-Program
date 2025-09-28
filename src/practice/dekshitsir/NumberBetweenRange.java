package practice.dekshitsir;

public class NumberBetweenRange {
    public static int countDigit(int num){
        int count1 = 0;
        while(num != 0){
            num = num / 10;
            count1++;
        }
        return count1;
    }
    public static long rangeOfNumber(long L,long R, long K){
        long count = 0;
       for(long i=L; i<=R; i++){
           count = count + countDigit((int) i);
           if(count >= K)
               return i;
       }
        return 0;
    }

    public static void main(String[] args) {

        long num = rangeOfNumber(11,25,10);
        System.out.println(num);
    }
}

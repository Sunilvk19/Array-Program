package practice.dekshitsir;

public class NumberBetweenRange {
    public static int countDigit(int num){
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }
    public static int rangeOfNumber(int L,int R, int K){
        int count = 0;
        for(int i=L; i<=R; i++){
            count += countDigit(i);
            if(count >= K)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int num = rangeOfNumber(1,20,15);
        System.out.println(num);
    }
}

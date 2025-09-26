package muthusir;

public class Alpha implements Runnable{
     int start;
     int end;

    Alpha(int start, int end){
        this.start = start;
        this.end = end;
    }
    public static int power(int base, int exp){
        int power = 1;
        for(int i=1; i<=exp; i++){
            power = power * base;
        }
        return power;
    }
    static boolean isArmstrongNumber(int num) {
        int sum = 0, temp = num;
        int digits = String.valueOf(temp).length();
        while (num != 0) {
            int res = num % 10;
            sum += power(res,digits);
            num /= 10;
        }
        return sum == temp;
    }
    @Override
    public void run() {
       for(int i=start; i<=end; i++){
           if(isArmstrongNumber(i)){
               System.out.println(Thread.currentThread().getName()+"Armstrong Number: "+i);
           }
           try {
               Thread.sleep(10);
           }catch (Exception e){
               System.out.println(e.getMessage());
           }
       }
    }

    public static void main(String[] args) {
      Thread t1 = new Thread(new Alpha(0,5000),"Thread-1");
      Thread t2 = new Thread(new Alpha(5001,10000),"Thread-2");
      t1.start();
      t2.start();
    }
}

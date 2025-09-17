package raghusir;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] ar1 = {1,2,3,4};
        int[] ar2 = {3,4,5,6};
        System.out.println("Intersection: ");
        for(int i=0; i<ar1.length; i++){
            for(int j=0; j<ar2.length; j++){
                if(ar1[i]==ar2[j]){
                    System.out.print(ar1[i]+" ");
                }
            }
        }
    }
}

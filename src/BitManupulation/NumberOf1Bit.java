package BitManupulation;

public class NumberOf1Bit {
    public static void main(String[] args) {
        int n=128;
        int r=hammingWeight(n);
        System.out.println(r);
    }
    public static  int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            count+=(n&1);
            n=n>>1;
        }
        return count;
    }
}

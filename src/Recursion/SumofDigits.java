package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
//        int n=12345;
//        int res=sumofDigits(n);
//        System.out.println(res);

    }
    public static int sumofDigits(int n){
        if(n==0) return 0;
        return n%10+sumofDigits(n/10);
    }

}

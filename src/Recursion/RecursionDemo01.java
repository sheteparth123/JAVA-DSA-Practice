package Recursion;

import java.sql.SQLOutput;

public class RecursionDemo01 {
    public static void main(String[] args) {
//        m1(1);
//        m2(1);
//        m3(5);
//        m4(1);
//        int res=fact(6);
//        System.out.println(res);
        int res=fibo(5);
        System.out.println(res);
    }
    public static void m1(int n){
        System.out.println(n);
        if(n==5) return;//base casem1(++n);


    }
    public static void m2(int n){
        if(n==6) return ;
        m2(++n);
        System.out.println(n-1);
    }
    public static void m3(int n){

        if(n==0) return;
        System.out.println(n);
        m3(--n);

    }
    public static void m4(int n){
        if(n%2!=0) System.out.println(n);
        if(n==5) return;

        m4(++n);
        if(n%2==0) System.out.println(n);



    }
    public static int fact(int n){
        if(n==0 || n==1 ) return 1;
        return n*fact(n-1);
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}

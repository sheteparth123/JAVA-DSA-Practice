package ConditionalStatements;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        largest(a,b,c);
    }
    public static void largest(double a,double b,double c ){
        if(a>b){
            if(a>c){
                System.out.println(a+" is largest");
            }
            else{
                System.out.println(c+" is largest");
            }
        }
        else if(b>c){
            System.out.println(b+" is largest");
        }
        else{
            System.out.println(c+" is largest");
        }
    }
}

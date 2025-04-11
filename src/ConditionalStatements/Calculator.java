package ConditionalStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter operation you want to perform");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':System.out.println(a+b);
                break;
            case '-':System.out.println(a-b);
                break;
            case '/':System.out.println(a/b);
                break;
            case '*':System.out.println(a*b);
                break;
            case '%':System.out.println(a%b);
                break;
            default:
                System.out.println("invalid");


        }
    }
}

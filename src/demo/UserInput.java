package demo;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println(age);
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println(name);
        String branch=sc.next();
        System.out.println(branch);
        char ch=sc.next().charAt(0);
        System.out.println(ch);
        boolean b=sc.nextBoolean();
        System.out.println(b);
        float f=sc.nextFloat();
        System.out.println(f);

    }
}

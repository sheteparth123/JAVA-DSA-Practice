package ConditionalStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        boolean res=LeapYearCheck(2004);
        System.out.println(res);
    }
    public static boolean LeapYearCheck(int year){
        if((year%4==0) && (year%100!=0 || year%400==0)){
            return true;
        }
        else{
           return false;
        }
    }
}

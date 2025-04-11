package ConditionalStatements;

import java.util.Scanner;

public class AtmWithdrawal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account balance:");
        double bal=sc.nextDouble();
        System.out.println("Enter money you want to withdraw in multiples of 100");
        int money_withdraw=sc.nextInt();
        if(money_withdraw>bal){
            System.out.println("Insufficient balance");
        }else if(money_withdraw%100==0){
            bal-=money_withdraw;
            bal=bal-0.50;
            System.out.println("Transaction succesful");
            System.out.println("Remaining bal= "+bal);
        }else{
            System.out.println("Enter in multipes of 100");
        }




    }
}

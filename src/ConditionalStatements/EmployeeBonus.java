package ConditionalStatements;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sal = sc.nextDouble();
        int exp = sc.nextInt();
        double bonus;
        if (exp > 5) {
            bonus = 0.10 * sal;
        } else {
            bonus = 0.05 * sal;
        }
        if (sal > 50000) {
            bonus = bonus + 0.05 * sal;
        } else if (sal < 30000) {
            bonus = bonus + 0 * sal;
        }
        double total_sal=sal+bonus;
        System.out.println(sal);
        System.out.println(bonus);
        System.out.println(total_sal);
    }
}

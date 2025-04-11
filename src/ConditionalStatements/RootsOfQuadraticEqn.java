package ConditionalStatements;

import java.util.*;

public class RootsOfQuadraticEqn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        double D=((b*b)-4*a*c);
        if (D > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots are real and distinct: " + root1 + " and " + root2);
        } else if (D == 0) {
            // One real repeated root
            double root = -b / (2 * a);
            System.out.println("Root is real and repeated: " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Roots are complex: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
        }



    }
}

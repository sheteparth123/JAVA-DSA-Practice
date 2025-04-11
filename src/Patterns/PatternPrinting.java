package Patterns;

public class PatternPrinting{
    public static void main(String[] args) {

        pattern01(5);
        System.out.println("-------------------------------------------");
        pattern02(5);
        System.out.println("-------------------------------------------");
        pattern03(5);
        System.out.println("-------------------------------------------");
        pattern04(5);
        System.out.println("-------------------------------------------");
        pattern05(5);
        System.out.println("-------------------------------------------");
        pattern06(5,6);
    }
    public static void pattern01(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern02(int n){
       int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(c++ +" ");
            }
            System.out.println();
        }
    }
    public static void pattern03(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    public static void pattern04(int n){

        for(int i=1;i<=n;i++){//lines
            for(int s=n-i;s>0;s--){//spaces
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){//stars

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern05(int n){
        for(int i=1;i<=n;i++){//lines
            for(int s=n-i;s>0;s--){//spaces
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){//stars

                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){//lines
            for(int s=1;s<=n-i;s++){//spaces
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){//stars

                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern06(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || j==1 || i==5 || j==6){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

}

package ConditionalStatements;


public class primenumber {
    public static void main(String[] args) {

       boolean res=checkPrime(7);
        System.out.println(res);
    }
    public static boolean checkPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
               return false;
            }
        }
        return true;
    }
}

package demo;

public class control {
    public static void main(String[] args) {
        int age=16;
        if(age>18){
            System.out.println("you are eligable for vote and driving licence");
        }
        else{
            System.out.println("you are not eligable  to vote");
            if(age>16){
                System.out.println("you are eligable for learning licence");
            }
            else{
                System.out.println("you are not  eligable for learning licence");
            }

        }
    }
}

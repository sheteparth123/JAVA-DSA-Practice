package demo;
import java.util.*;
public class timepass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1 ,2 ,3,4,-5,6,7,8,9,10};


        for(int i=0;i< arr.length;i++){
            if(arr[i]<=0){
                break;

            } else if (arr[i]%2!=0) {
                continue;
            }else {
                System.out.println(arr[i]);
            }


        }


        System.out.println("negative number found");
    }
}

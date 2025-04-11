package ArrayQuestions;
import java.util.*;

public class BuyAndSellStock{
    public static void main(String[] args) {
        int arr[]={7,10,1,3,6,9,2};
        int n=arr.length;
        maxProfit(arr,n);
    }
    public static void maxProfit(int arr[],int n){
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        System.out.println(res);
    }
}

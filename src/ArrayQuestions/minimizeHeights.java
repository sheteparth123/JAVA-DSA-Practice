package ArrayQuestions;

import java.util.Arrays;

public class minimizeHeights{
    public static void main(String[] args) {
        int arr[]={3,9,12,14,20};
        int res=getDiffrence(arr,3);
        System.out.println(res);
    }
    public static int getDiffrence(int arr[],int k){
        Arrays.sort(arr);
        int diff=arr[arr.length-1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-k<0){
                continue;
            }
            int min=Math.min(arr[0]+k,arr[i]-k);
            int max=Math.max(arr[i-1]+k,arr[arr.length-1]-k);
            diff=Math.min(diff,max-min);
        }

        return diff;
    }
}

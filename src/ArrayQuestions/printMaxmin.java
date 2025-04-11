package ArrayQuestions;

import java.util.Arrays;

public class printMaxmin {
    public static void main(String[] args) {
        int arr[]={3,6,1,4,8,9,2,5,10,7};
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        for(int i=0,j=arr.length;i<mid || j>mid;i++,j--){
            System.out.print(arr[j]+" ");
            System.out.print(arr[i]+" ");
        }
    }
}

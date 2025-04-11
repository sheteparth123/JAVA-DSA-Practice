package ArrayQuestions;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void sort012(int arr[]){
        int l=0;
        int m=0;
        int h=arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                m++;
                l++;
            }
            else if(arr[m]==2){
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                h--;
            }
            else{
                m++;
            }
        }
    }
}

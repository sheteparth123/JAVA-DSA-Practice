package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[]={3,4,5,6};
        BubbleSorting(arr);

    }
    public static void BubbleSorting(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){  // > for descending
                    int temp=arr[j];//swap
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }

            if(swap==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

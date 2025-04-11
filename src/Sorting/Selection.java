package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[]={88,12,33,98,56};
         selectionSort(arr);
    }
    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
               min=j;
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}

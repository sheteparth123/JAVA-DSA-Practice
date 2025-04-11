package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[]={88,12,33,98,56};
        InsertionSort(arr);

    }
    public static void InsertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            if (j == i - 1) {
                break;  // Early exit when the array is already sorted
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

package Sorting;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
       int arr[]={3,34,67,21,34,2,7,90,57};
       QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void QuickSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        int pivot=arr[mid];
        int left=low;
        int right=high;
        while(left<=right) {
            while(arr[left]<pivot){
                left++;

            }
            while(arr[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        QuickSort(arr,low,right);
        QuickSort(arr,left,high);


    }
}

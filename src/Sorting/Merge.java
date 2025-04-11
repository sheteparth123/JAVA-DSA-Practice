package Sorting;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
//        int arr1[]={1,3,5,7,10,13,15};
//        int arr2[]={2,4,6,8};
//        int res[]=mergeTwoSortedArray(arr1,arr2);
//        System.out.println(Arrays.toString(res));
        int arr[]={23,34,67,21,34,2,7,90,57};
        int result[]=mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(result));

    }
    public static int[] mergeSort(int arr[],int low,int high){
        if(low==high){
            int bs[]=new int[1];
            bs[0]=arr[low];
            return bs;
        }
        int mid=(low+high)/2;
        int left[]=mergeSort(arr,low,mid);
        int right[]=mergeSort(arr,mid+1,high);
        int merge[]=mergeTwoSortedArray(left,right);
        return merge;



    }
    public static int[] mergeTwoSortedArray(int arr1[],int arr2[]){
        int i=0;
        int j=0;
        int k=0;
        int res[]=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;
            }
            else{
              res[k]=arr2[j];
              j++;
              k++;
            }
        }
        //what if one of array is ended
        while(i<arr1.length){
            res[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            res[k]=arr2[j];
            j++;
            k++;
        }
        return res;
    }
}

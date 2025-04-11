package Searching;

public class Search {
    public static void main(String[] args) {
        int arr[]={10,2,4,56,6};
        int arr2[]={1,2,3,4,5,6,7,8,9};
        int res=linear(arr,2);
        System.out.println("Element found  at index:"+res);
       int res1= binary(arr2,5);
        System.out.println("Element found  at index:"+res1);

    }
    public static int linear(int arr[],int val){
        for(int i=0;i<arr.length;i++){
            if(val==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static int binary(int arr2[],int val){
        int low=0;
        int high=arr2.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr2[mid]==val){
                return mid;
            }
            else if(arr2[mid]<val){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
}

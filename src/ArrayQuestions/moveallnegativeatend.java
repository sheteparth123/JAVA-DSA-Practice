package ArrayQuestions;

import java.util.Arrays;

public class moveallnegativeatend{

    public static void main(String[] args) {
        int arr[]={1,-2,-8,4,3,-1,5,-9};
        pushnegativesatend(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void pushnegativesatend(int arr[]){
        int j=0;
        int temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0 && arr[j]<0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]>=0){
                j++;
            }

        }
    }
}


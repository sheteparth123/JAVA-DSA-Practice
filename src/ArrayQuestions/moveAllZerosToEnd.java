package ArrayQuestions;

import java.util.Arrays;

public class moveAllZerosToEnd {
    public static void main(String[] args) {
        int arr[]={1,0,0,4,3,0,5,0};
        pushzerosatend(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void pushzerosatend(int arr[]){
        int j=0;
        int temp;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }

        }
    }
}

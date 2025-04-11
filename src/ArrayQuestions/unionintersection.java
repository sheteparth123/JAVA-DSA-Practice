package ArrayQuestions;

import java.util.Arrays;

public class unionintersection {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,3,5,7,9};
        int arr3[]=new int[10];
        int arr4[]=new int[10];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr3[i]=arr1[i];
                }
            }
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]!=arr2[j]||arr1[i]==arr2[j]){
                    arr4[i]=arr1[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}

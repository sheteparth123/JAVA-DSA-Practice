package ArrayQuestions;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
       int arr[]={2,3,4,5,6,7,8,9,4};
       int res=calculateLength(arr);
        System.out.println(res);
    }
    public static int calculateLength(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            count++;
        }
        return count;

    }

    public static class countduplicates {
        public static void main(String[] args) {
            String s = "abcdab";
            findDuplicate(s);
        }

        public static void findDuplicate(String s){
            int arr[]=new int[25];

            for(int i=0;i<s.length();i++){
                int charValue=s.charAt(i);
                int arrayIndex=charValue-97;
                arr[arrayIndex]++;
            }
            System.out.println(Arrays.toString(arr));
            for(int i=0;i<arr.length;i++){
                if(arr[i]>1){
                    char c= (char) (97+i);
                    System.out.println("duplicate values are: "+c);
                }

            }

        }
    }
}

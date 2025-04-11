package StringQuestions;

import java.util.Arrays;

public class countduplicates {
    public static void main(String[] args) {
        String s=new String("abcabcabcpakz");
        findDuplicates(s);
    }
    public static void findDuplicates(String s){
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            int charValue=s.charAt(i);
            int arrayIndex=charValue-97;
            arr[arrayIndex]++;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1){
                char c=(char)(97+i);
                System.out.println("Duplicates value are= "+c);
            }
        }
    }
}

package StringQuestions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2= "silent";
        boolean res=checkAnagram(s1,s2);

        if(res==true){
            System.out.println(s1 +" and "+s2+" are Anagram");
        }else {
            System.out.println(s1 +" and "+s2+" are not a Anagram");
        }
    }
    public static boolean checkAnagram(String s1,String s2){
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<s1.length();i++) {
            int charValueofs1 =s1.charAt(i);
            int array1Index=charValueofs1-97;
            arr1[array1Index]++;

        }
        for(int j=0;j<s2.length();j++) {
            int charValueofs2 =s2.charAt(j);
            int array2Index=charValueofs2-97;
            arr2[array2Index]++;

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<arr1.length;i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
         return true;

    }
}

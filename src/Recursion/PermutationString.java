package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationString {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String> res=new ArrayList<>();
        permutation(s,"",res);
        System.out.println(res);


    }
    public static void permutation(String s,String base,ArrayList<String> res){

        if(s.isEmpty()){
           res.add(base);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String rem=s.substring(0,i)+s.substring(i+1);
            permutation(rem,base+ch,res);


        }
    }
}

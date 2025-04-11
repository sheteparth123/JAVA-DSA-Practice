package Recursion;

import java.util.ArrayList;

public class Permutation2 {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(getPer(s));

    }
    public static ArrayList<String> getPer(String s) {
        if(s.isEmpty()){
            ArrayList<String> al=new ArrayList<>();
            al.add("");
            return al;
        }
        char cc=s.charAt(0);
        String rem=s.substring(1);
        ArrayList<String> rec=getPer(rem);
        ArrayList<String> myres=new ArrayList<>();
        for(String res:rec){
            for(int i=0;i<=res.length();i++){
               String val=res.substring(0,i)+cc+res.substring(i);
               myres.add(val);
            }
        }
        return myres;
    }

}

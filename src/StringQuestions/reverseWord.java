package StringQuestions;

import java.util.Arrays;

public class reverseWord {
    public static void main(String[] args) {
        String s="I love CFS";

        StringBuilder res=new StringBuilder();
        int end=s.length();
        for(int i=end-1;i>=0;i--){
            if(s.charAt(i)==' '){
                res.append(s.substring(i+1,end)).append(" ");
                end=i;
            }

        }
        if(end>0){
            res.append(s.substring(0,end));
        }
        System.out.println(res);



    }

}

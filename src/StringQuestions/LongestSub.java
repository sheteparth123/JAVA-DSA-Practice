package StringQuestions;

import java.util.HashMap;

public class LongestSub {
    public static void main(String[] args) {
        String s="ABCDEGHCBCD";
        int res=longestNonRepeatingSubstring(s);
        System.out.println(res);
    }
    public static int longestNonRepeatingSubstring(String s){
        int l=0;
        int len=0;
        HashMap<Character,Integer> map =new HashMap<>();
        for(int r=0;r<s.length();r++){
            char cc=s.charAt(r);
            if(map.containsKey(cc) && map.get(cc)>=l){
                l=map.get(cc)+1;
            }
            map.put(cc,r);
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}

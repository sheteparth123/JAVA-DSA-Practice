package Recursion;

public class ReverseaString {
    public static void main(String[] args) {
        String s="abcd";
        String result=reverseRec(s);
        System.out.println(result);
    }
    public static String StringRev(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res = s.charAt(i) + res;
        }
        return res;

    }
    public static String reverseRec(String s){
        if(s.isEmpty()) return s;
        return reverseRec(s.substring(1))+s.charAt(0);
    }
}

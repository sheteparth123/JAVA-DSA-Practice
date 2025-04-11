package Stack;

import java.util.Stack;

public class BackspaceCompare {
    public static void main(String[] args) {
        String s1="ab#c";
        String s2="ad#c";
        System.out.println(backspaceCompare(s1,s2));
    }
    public static boolean backspaceCompare(String s1,String s2) {
        return stackOperation(s1).equals(stackOperation(s2));
    }
    public static String stackOperation(String s){
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:stack){
            sb.append(c);

        }
        return sb.toString();
    }

}

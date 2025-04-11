package StringQuestions;

public class pallindrome {
    public static void main(String[] args) {
        String s=new String("malayalam");
        boolean res=checkPallindrome(s);
        System.out.println(res);
    }
    public static boolean checkPallindrome(String s){
        int l=s.length();
        boolean flag=true;
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-1-i)){
                flag=false;
            }
        }
        return flag;

    }
}

package StringQuestions;

public class counterchar {
    public static void main(String[] args) {
        String s="aaabbbccc";
        int c=1;
        StringBuilder builder=new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                builder.append(s.charAt(i-1)).append(c);
                c=1;
            }

        }
        builder.append(s.charAt(s.length()-1)).append(c);//last
        System.out.println(builder);
    }
}

package StringQuestions;

public class ReverseString {

        public static void main(String[] args) {
            String s="abcd";
            String result=StringRev(s);
            System.out.println(result);
        }
        public static String StringRev(String s) {
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                res = s.charAt(i) + res;
            }
            return res;

        }
    }


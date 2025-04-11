public class prac {
    public static void main(String[] args) {
        String str="cabcbad";
        int L;
        int maxlen=Integer.MIN_VALUE;
        int currlen=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++) {
            L=i;
            int R=str.length()-1;
            while (L < R) {
                if (str.charAt(L) == str.charAt(R)) {
                    sb.setLength(0);
                    sb.append(str.substring(L, R + 1));
                    StringBuilder sb1=new StringBuilder(sb);
                    sb1.reverse();
                    if (sb.toString().equals(sb1.toString())) {
                        currlen = sb.length();
                        maxlen = Math.max(maxlen, currlen);
                    }
                }

                R--;
            }
        }
        System.out.println(maxlen);
    }
}




package BitManupulation;

import java.util.Arrays;

public class CountBits {
    public static int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=1;i<=n;i++){
            if(i%2==0){
                res[i]=res[i/2];
            }
            else{
                res[i]=res[i/2]+1;
            }
        }
        return res;
    }
    public static int[] countBits1(int n) {
        int res[]=new int[n+1];
        for(int i=1;i<=n;i++){
            res[i]=res[i>>1]+(i&1);
        }
        return res;
    }

    public static void main(String[] args) {

        int arr[]=countBits1(10);
        System.out.println(Arrays.toString(arr));


    }
}

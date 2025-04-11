package ArrayQuestions;

import java.util.ArrayList;

public class indexSubarray {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8,9,10};
       int k=15;
       ArrayList<Integer> res=subarraySum(arr,k);
        System.out.println(res);
    }
    static ArrayList<Integer> subarraySum(int[] arr, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        int l=0;
        int r=0;
        boolean flag=false;
        int n= arr.length;
        int sum=arr[0];
        if(k==0){
            res.add(-1);
            return res;
        }
        while(r<n){
            if(sum==k){
               flag=true;
               break;
            }
            else if (sum<k) {
                r++;
                if (r < n) {
                    sum += arr[r];
                }
            }
            else {
                sum -= arr[l];
                if (l < n) {
                    l++;
                }
            }

        }
      if(flag==true){
          res.add(l+1);
          res.add(r+1);//1 based indexing
          return res;
      }
      res.add(-1);
      return res;
    }
}

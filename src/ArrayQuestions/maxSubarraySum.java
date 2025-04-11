package ArrayQuestions;

public class maxSubarraySum {
    public static void main(String[] args) {
        int arr[]={2,3,-8,7,-1,2,3};
//        int res=largestSumofsubarray(arr);
//        System.out.println(res);
        maxSubarraysum(arr);

    }
    //using two loops -O(n^2)
    public static int largestSumofsubarray(int arr[]){

        int prevsum=0;int currsum=0;
        for(int j=0;j<arr.length;j++) {
            currsum=0;
            currsum=arr[j];
            int a=prevsum;
            for (int i = j+1; i < arr.length; i++) {

                currsum = arr[i] + currsum;
                if (currsum > prevsum) {
                    prevsum = currsum;
                }
            }

            prevsum=Math.max(a,prevsum);


        }


        return prevsum;
    }
    //Using kadane's Algorithm -O(n)
    public static void maxSubarraysum(int arr[]){
        int result=0;
        int me=arr[0];
        for(int i=1;i<arr.length;i++){
          me=Math.max(me+arr[i],arr[i]);
          result=Math.max(result,me);
        }
        System.out.println(result);
    }
}

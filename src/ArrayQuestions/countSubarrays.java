package ArrayQuestions;

public class countSubarrays {
    static int count=0;
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int target=7;

        countnoofsubarrays(arr,5);
        System.out.println(count);
    }
    public static int countnoofsubarrays(int arr[],int target){
        int sum=0;int sec=0;
        for(int i=0;i<arr.length;i++) {
            sum=0;
             sum=arr[i];
             int j=0;
            for( j=i+1;j<arr.length;j++) {
                sec=j;
               int prevsum=sum;
                sum=sum+arr[j];
                if(sum==target){
                    count++;
                    sum=arr[i];

                }
                if(sum>target){
                    sum=prevsum;
                    if(j==arr.length-1) {
                        j = 0;
                    }

                    continue;
                }
            }

        }

        return count;
    }
}

package BitManupulation;

public class SingleNumber {
    public static int singleNo(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x=x^nums[i];
        }
        return x;
    }

    public static void main(String[] args) {

       int nums[]={2,3,1,2,3};
       int res=singleNo(nums);
        System.out.println(res);
    }
}

package Searching;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2,3};
        int res=search(nums,6);
        System.out.println(res);
    }
    public static  int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]==target){
                return  m;
            }
            //check for left sorted array
            else if(nums[l]<=nums[m]){
                if(target>=nums[l] && target<=nums[m]){
                    h=m-1;
                }
                else{
                    l=m+1;
                }
            }
            //check for right sorted array
            else{
                if(target<=nums[h] && target>=nums[m]){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }

        }
        return -1;

    }

}

package Recursion;

public class LinearSearchusingrecursion {
    public static void main(String[] args) {
        int arr[]={2,3,3,4,5,4,1,1};
        int data=4;
        int r=findlastidx(arr,data,0);
        System.out.println(r);
    }
    public static int findfirstidx(int arr[],int data,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==data){
            return idx;
        }
        else{
           int res= findfirstidx(arr,data,idx+1);
           return res;
        }
    }
    public static int findlastidx(int arr[],int data,int idx){
        if(idx==arr.length){
            return -1;
        }
        int res=findlastidx(arr,data,idx+1);
        if(res==-1){
              if(arr[idx]==data){
                 return idx;
              }
              else{
                  return -1;
                }
        }
        else{
           return res;
        }

    }
}

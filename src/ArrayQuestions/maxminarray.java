package ArrayQuestions;

public class maxminarray {
    public static void main(String[] args) {
        int arr[]={10,30,12,1,5,55,34,21};
        int max= Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int secmax=Integer.MIN_VALUE,secmin=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secmax && arr[i]<max){
                secmax=arr[i];
            }
            if(arr[i]<secmin && arr[i]>min){
                secmin=arr[i];
            }

        }
        System.out.println(secmax);
        System.out.println(secmin);
    }
}

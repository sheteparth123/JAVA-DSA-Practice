package ArrayQuestions;


public class secmaxmin {
    public static void main(String[] args) {
        int arr[]={10,4,5,8,11,2};
        SecondMaxAndMin(arr);

    }
    public static void SecondMaxAndMin(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secmax=Integer.MIN_VALUE;
        int secmin=Integer.MAX_VALUE;
        for(int data:arr){
            if(data>max){
                secmax=max;
                max=data;
            }
            else if(data>secmax && data!=max){
                secmax=data;
            }
            if(data<min){
                secmin=min;
                min=data;
            }
            else if(data<secmin && data!=min){
                secmin=data;
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Second Max= "+secmax);
        System.out.println("Min= "+min);
        System.out.println("Second Min= "+secmin);

    }

}

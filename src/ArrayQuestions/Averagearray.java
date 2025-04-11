package ArrayQuestions;

public class Averagearray {
    public static void main(String[] args) {
        int arr[]={13,13,13,13,13};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        float avg=sum/arr.length;
        System.out.println(avg);
    }
}

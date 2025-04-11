package ArrayQuestions;

public class Sumofarr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int sum=0;
        for(int i=0;i<arr.length;i+=2){//alternate sum

                sum = sum + arr[i];

        }
        System.out.println(sum);


    }

    public static class copyarray {
        public static void main(String[] args) {
            int arr1[]={1,2,3,4,5};
            int arr2[]=new int[5];
            for(int i=arr1.length-1,j=0;i>=0;i--,j++){
                arr2[j]=arr1[i];
            }
            for(int a:arr2){
                System.out.print(a);
            }
        }
    }
}

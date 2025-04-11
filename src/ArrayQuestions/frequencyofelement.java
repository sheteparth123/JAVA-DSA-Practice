package ArrayQuestions;

public class frequencyofelement {
    public static void main(String[] args) {
        int arr[]={1,10,2,1,0,1,0,0,1,1,1,0};
        int key1=1,key0=0,countof0=0,countof1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key1){
                countof1++;
            }
            if(arr[i]==key0){
                countof0++;
            }
        }
        System.out.println("Frequency of "+key1+" is "+countof1);
        System.out.println("Frequency of "+key0+" is "+countof0);
    }
}

package ArrayQuestions;

public class findElement {
    public static void main(String[] args) {
        int arr[]={10,30,50,70};
        int key=30;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            {
                System.out.println("the element "+ arr[i]+  " is at index " +i);

            }
        }
    }
}

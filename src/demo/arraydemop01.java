package demo;

public class arraydemop01 {
    public static void main(String[] args) {
        int arr[]=new int[5];       //creating an array
        arr[0]=99;                   //insert
        arr[1]=100;
        for(int j=2;j<arr.length;j++){   //insert
            arr[j]=j;
        }
        for(int i=0;i<arr.length;i++){   //fetch
            System.out.println(arr[i]);
        }
        for(int a:arr){                 //for each
            System.out.println(a);
        }
    }
}

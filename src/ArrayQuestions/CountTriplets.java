package ArrayQuestions;

public class CountTriplets {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
          int res=countTriplet(arr);
        System.out.println(res);
    }

      static  int countTriplet(int arr[]) {  //O(n^3)
        int c=0;
          for (int i = 0; i < arr.length; i++) {
              for (int j = i + 1; j < arr.length; j++) {
                  int sum = arr[i] + arr[j];
                  for (int k = 0; k < arr.length; k++) {
                      if (k != i && k != j && arr[k] == sum) {
                          c++;
                      }
                  }
                  sum=0;

              }
          }
          return c;
      }

}

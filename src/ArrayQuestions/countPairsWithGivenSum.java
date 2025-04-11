package ArrayQuestions;

public class countPairsWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1, 5};
        int k = 6;
        int res=countpairs(arr, k);
        System.out.println(res);
    }

    public static int countpairs(int arr[], int k) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +  1; j < arr.length; j++) {
//                int sum = arr[i];
                int sum = arr[i] + arr[j];
                if (sum == k) {
                    c++;
                }
            }
        }
        return c;
    }
}



public class KadaneAlgorithm {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArraySum(arr));
    }

    private static int maxSubArraySum(int arr[]) {
        int max_so_far = Integer.MIN_VALUE;
        int max_end = 0;
        int size = arr.length;


        for (int i = 0; i < size; i++) {
            max_end = max_end + arr[i];
            if (max_end > max_so_far) {
                max_so_far = max_end;
            }
            if (max_end < 0) {
                max_end = 0;
            }
        }
        return max_so_far;
    }

}

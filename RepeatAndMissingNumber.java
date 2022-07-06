import java.util.HashSet;

public class RepeatAndMissingNumber {

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1, 7, 8, 9, 10};
        int[] RnM = missingNrepeat(arr);
        System.out.println("Repeat = " + RnM[0]+" Missing = "+RnM[1]);
    }

    private static int[] missingNrepeat(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        int repeat = 0;
        int missing = 0;

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (!hashSet.add(arr[i])){
                repeat = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 1; i < max; i++) {
            if (!hashSet.contains(i)){
                missing = i;
                break;
            }
        }
        return new int[]{repeat,missing};
    }
}

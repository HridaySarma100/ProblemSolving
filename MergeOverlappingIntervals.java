import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        arr =  merge(arr);
        System.out.println("Intervals are ");
        for (int[] ints : arr) {
            System.out.println(ints[0] + "   " + ints[1]);
        }
    }

    private static int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int i = 0;
        int n = arr.length;
        int s = -1;
        int e = -1;

        while (i < n) {
            if (s == -1) {
                s = arr[i][0];
                e = arr[i][1];
            } else {
                if (arr[i][0] < e) {
                    e = Math.max(e, arr[i][1]);
                } else {
                    list.add(new int[]{s, e});
                    s = arr[i][0];
                    e = arr[i][1];
                }
            }
            i++;
        }
        if (s != -1) {
            list.add(new int[]{s, e});
        }
        int[][] arr2 = new int[list.size()][2];
        return list.toArray(arr2);
    }
}

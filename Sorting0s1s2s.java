public class Sorting0s1s2s {

    public static void main(String[] args) {
        int[] arr = {1,0,0,0,0,2,2,2,2,0,1,1,0,0,0,1};
        sortArr(arr);
        for (int i :
                arr) {
            System.out.println(i);
        }
    }

    private static void sortArr(int[] arr) {
        int low = 0;
        int hi = arr.length -1;
        int mid = 0; int temp = 0;

        while (mid <= hi){
            switch (arr[mid]){
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                    break;
            }
        }

    }
}

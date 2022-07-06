import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num :
                nums) {
            if (!hashSet.add(num)) {
                return true;
            }
        }
        return false;
    }
}

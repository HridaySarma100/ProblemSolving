import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abbccccddd"));
    }
    private static int longestPalindrome(String s){
        HashSet<Character> hashSet = new HashSet<>();

        int resultCount = 0;  // 2 + 2 + 2
        int containsOdd = 0;

        for (int i = 0;i<s.length();i++){
            if (!hashSet.contains(s.charAt(i))){
                hashSet.add(s.charAt(i));
                containsOdd ++;
            }else {
                resultCount = resultCount+2;
                hashSet.remove(s.charAt(i));
                containsOdd--;
            }
        }

        if (containsOdd > 0)resultCount++;

        return resultCount;

    }
}

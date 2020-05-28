import java.util.ArrayList;
import java.util.List;

public class LongstSubstr_2 {
    public static int lengthOfLongestSubstring(String s) {
        int lenConter = 0;
        int maxSubstringLen = 1;
        List<String> substringChars = new ArrayList<>();

        String[] chars = s.split("");
        for (String curChar : chars){
            lenConter++;
            if (substringChars.contains( curChar)){
                if (maxSubstringLen < lenConter) {
                    maxSubstringLen = lenConter;
                }
                substringChars.clear();
                lenConter = 0;
            }
            substringChars.add( curChar);
        }
        return maxSubstringLen;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

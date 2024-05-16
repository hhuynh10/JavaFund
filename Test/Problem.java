import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        String s3 = "rat";
        String s4 = "car";

        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagram(s3, s4));
    }

    public static boolean isAnagram(String s, String t) {
        int[] sCount = new int[26];
        int[] tCount = new int[26];

        for (char c : s.toCharArray()){
            sCount[c - 'a']++;
        }
        for (char c : t.toCharArray()){
            tCount[c - 'a']++;
        }

        if (Arrays.equals(sCount, tCount)){
            return true;
        }
        return false;
    }
}
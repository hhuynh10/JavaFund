import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagdfgfaram";
        String s3 = "rat";
        String s4 = "car";

        System.out.println(isAnagram(s1, s2));
        System.out.println(isAnagram(s3, s4));
    }

    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        
        while (l < r){
            while (l < r && !isValid(s.charAt(l))){
                l++;
                continue;
            }
            while (l < r && !isValid(s.charAt(r))){
                r--;
                continue;
            }
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public static boolean isValid(char c){
        return 'a' <= c && c <= 'z' ||
                'A' <= c && c <= 'Z' ||
                '0' <= c && c <= '9';
    }
}
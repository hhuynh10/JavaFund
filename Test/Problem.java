public class Problem {
    public static void main(String[] args) {
        String p = "DHGqwT6";
        System.out.println(password(p));
    }

    public static boolean password(String s){
        if (!(s.length() >= 6 && s.length() < 10)){
            return false;
        }
        
        for (int i = 0; i < s.length(); i++){
            if (!((s.charAt(i) >= 48 && s.charAt(i) <= 57) || (s.charAt(i) >= 65 && s.charAt(i) <= 90))){
                return false;
            }
        }
        return true;
    }
}
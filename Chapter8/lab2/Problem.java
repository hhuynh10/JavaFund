import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count;
        String userInput = "";
        do {
            count = 0;
            System.out.print("Enter your password: ");
            userInput = input.nextLine();

            if (!length(userInput)) {
                System.out.println("Must be 8 or more characters.");
            } else {
                if (lowercase(userInput)) {
                    count++;
                } else {
                    System.out.println("Must contain at least one lowercase character.");
                }

                if (uppercase(userInput)) {
                    count++;
                } else {
                    System.out.println("Must contain at least one uppercase character.");
                }

                if (number(userInput)) {
                    count++;
                } else {
                    System.out.println("Must contain at least one numeric character.");
                }

                if (specialChar(userInput)) {
                    count++;
                } else {
                    System.out.println("Must contain at least one special character.");
                }
            }
        } while (count < 3);

        if (count >= 3 && userInput.length() >= 8)
        System.out.println("Your password is valid.");
    }

    public static boolean length(String str){
        if (str.length() < 8){
            return false;
        }
        return true;
    }

    public static boolean lowercase(String str){
        for (int i = 0; i < str.length(); i++){
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z'){
                return true;
            }
        }
        return false;
    }

    public static boolean uppercase(String str){
        for (int i = 0; i < str.length(); i++){
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                return true;
            }
        }
        return false;
    }

    public static boolean number(String str){
        for (int i = 0; i < str.length(); i++){
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9'){
                return true;
            }
        }
        return false;
    }

    public static boolean specialChar(String str){
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '#' || str.charAt(i) == '$' || str.charAt(i) == '!' || str.charAt(i) == '-' || str.charAt(i) == '_'){
                return true;
            }
        }
        return false;
    }
}

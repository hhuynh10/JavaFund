import java.util.Scanner;

public class Problem{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userString;
        char usingChar;
        boolean found = false;
        boolean isFirstMatch = true;
        int i;

        System.out.print("Input your string and letter with a coma space between them: ");
        userString = input.next();
        usingChar = input.next().charAt(0);

        for (i = 0; i < userString.length(); i++) {
            if (Character.toLowerCase(usingChar) == Character.toLowerCase(userString.charAt(i))) {
                if (!isFirstMatch) {
                    System.out.print(", ");
                    }
                    System.out.print(i + 1);
                    found = true;
                    isFirstMatch = false; 
                }
        }
        if (!found) 
            System.out.print("Not found!");
    }
}

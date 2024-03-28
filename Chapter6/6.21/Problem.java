//import API's needed here:
import java.util.Scanner;

public class Problem {

    public static void main(String args[]) {
        String userInput;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        userInput = input.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);
            if (Character.isLetter(currentChar)) {
                System.out.print(getNumber(currentChar));
            } else {
                System.out.print(currentChar);
            }
        }
    } //closing main method

    public static int getNumber(char uppercaseLetter) {
        int num = 0;
        switch (Character.toLowerCase(uppercaseLetter)) {
            case 'a':
            case 'b':
            case 'c':
                num = 2;
                break;
            case 'd':
            case 'e':
            case 'f':
                num = 3;
                break;
            case 'g':
            case 'h':
            case 'i':
                num = 4;
                break;
            case 'j':
            case 'k':
            case 'l':
                num = 5;
                break;
            case 'm':
            case 'n':
            case 'o':
                num = 6;
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                num = 7;
                break;
            case 't':
            case 'u':
            case 'v':
                num = 8;
                break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                num = 9;
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        return num;
    } 
} //closing class header
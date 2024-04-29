import java.util.Scanner;;
public class Problem {
    public static void main(String[] args){
        howManyEnteredBeforeSeenBoth(25, 17);
    }

    public static void howManyEnteredBeforeSeenBoth(int a, int b) {
        Scanner input = new Scanner(System.in);
        boolean firstA = true;
        boolean firstB = true;
        int count = 0;
        int totalCount = 0;
        while (count < 2){
            System.out.print("Enter an int: ");
            int userInput = input.nextInt();
            if (firstA){
                if (userInput == a){
                    count++;
                    firstA = false;
                }
            }
            if (firstB){
                if (userInput == b){
                    count++;
                    firstB = false;
                }
            }
            totalCount++;
        }
        System.out.println("You had to enter " + totalCount + " integers before typing both " + a + " and " + b + ".");
    }
}

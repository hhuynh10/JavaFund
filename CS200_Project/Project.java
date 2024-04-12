import java.util.Scanner;

public class Project {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        final int EASY = 10;
        final int MEDIUM = 15;
        final int HARD = 20;

        int userPoints;
        int userAttempts;
        String userAns;
        int hints;
        int randomQuestions;

        String welcome = "Welcome to Java Beans' Project";
        String gameRules = "Starting Points: Players begin their gaming journey with an initial pool of 50 points.\n"
                + "Difficulty Levels: Players have the flexibility to choose questions from three distinct difficulty levels: Easy, Medium, and Hard. Each level corresponds to a specific point value: 10 points for Easy, 15 points for Medium, and 20 points for Hard questions.\n"
                + "Attempts: Players are granted three attempts to respond to each question.\n"
                + "Point System:\n"
                + "A correct answer results in point accumulation based on the difficulty level of the question.\n"
                + "Easy questions earn 10 points, Medium questions earn 15 points, and Hard questions earn 20 points.\n"
                + "An incorrect answer incurs a deduction in points.\n"
                + "Game Restart:\n"
                + "The game restarts when the player accumulates 150 points.\n"
                + "The game also restarts if the player reaches zero points due to a loss.\n";

        String[] congratsMessages = {
                "Congratulations, your answer is correct!",
                "Great job, you got it right!",
                "Well done, your answer is spot on!",
                "You nailed it, that's the correct answer!",
                "Fantastic, your response is accurate!",
                "Bravo, your solution is correct!",
                "Excellent work, your answer is right!",
                "Outstanding, you got it!",
                "Superb, your response is correct!",
                "Splendid, well done on the correct answer!"
        };

        String[] motivationalMessages = {
                "Keep trying, you're getting closer!",
                "You're on the right track, keep going!",
                "Don't give up, you're making progress!",
                "Almost there, keep pushing forward!",
                "You're getting warmer, keep at it!",
                "You're moving in the right direction, keep it up!",
                "Persistence pays off, keep going!",
                "Closer and closer, keep up the effort!",
                "Each attempt gets you closer, keep trying!",
                "You're getting there, just a little more effort!"
        };

        printMessages(welcome);

        System.out.print("Would you like to go over the game rules?\n" + "(Y)es or (N)o? ");
        userAns = input.nextLine().toLowerCase();

        while (userAns.isEmpty() || (userAns.charAt(0) != 'y' && userAns.charAt(0) != 'n')) {
            System.out.print("Would you like to go over the game rules?\n" + "(Y)es or (N)o? ");
            userAns = input.nextLine().toLowerCase();
        }
        if (userAns.charAt(0) == 'y') {
            printMessages(gameRules);
        }

        do {
            userPoints = 50;
            do {
                userAttempts = 2;
                randomQuestions = (int)(Math.random() * 2);
                System.out.print("Would you like to choose easy, medium or hard question?\n" + "(E)asy, (M)edium, or (H)ard? ");
                userAns = input.nextLine().toLowerCase();

                if (userAns.length() > 0 && userAns.charAt(0) == 'e') {
                    switch(randomQuestions){
                        case 0:
                        userPoints = factorialQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, EASY);
                        break;
                        case 1:
                        userPoints = averageQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, EASY);
                        break;
                    }
                } else if (userAns.length() > 0 && userAns.charAt(0) == 'm') {
                    System.out.println("Incoming...");
                } else if (userAns.length() > 0 && userAns.charAt(0) == 'h') {
                    System.out.println("Incoming...");
                }
            } while (0 < userPoints && userPoints < 150);
            
            userPoints = 50;
            userAttempts = 2;
            hints = 2;
            System.out.print("Do you want to (R)estart or press any key to exit? ");
            userAns = input.nextLine().toLowerCase();
            if (userAns.length() > 0 && userAns.charAt(0) == 'r') {
                System.out.println("Game restarting now!");
            }
        } while (userAns.length() > 0 && userAns.charAt(0) == 'r');

        System.out.println("Thanks for playing!");
    }

    // General methods
    public static void printMessages(String message) {
        System.out.println(message);
    }

    public static void printMessages(String[] messageList) {
        System.out.println(messageList[(int) (Math.random() * messageList.length)]);
    }

    public static int[] randNumbers(int n) {
        int[] randNumberList = new int[n];
        for (int i = 0; i < randNumberList.length; i++) {
            randNumberList[i] = (int) (Math.random() * 10);
        }
        return randNumberList;
    }

    public static String randNumberString(int[] arr) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]).append(" ");
        }
        return str.toString();
    }

    public static int secretQuestion(int points, String[] congratsMessages) {
        if (Math.random() <= 0.5) {
            Scanner input = new Scanner(System.in);
            String userInput;
            System.out.println("YOU GOT A SECRET QUESTION!!!\n(if answer correct +50 points otherwise -50 points)");
            System.out.print("Would you like to risk? (Y)es or (N)o? ");
            userInput = input.next().toLowerCase();
            int randNum = (int)(Math.random() * 10);
            if (userInput.charAt(0) == 'y') {
                System.out.print("Guess a random number from 0 - 9: ");
                userInput = input.next();
                if (Integer.parseInt(userInput) == randNum){
                    printMessages(congratsMessages);
                    points += 50;
                    System.out.println("Your current points: " + points);
                } else {
                    System.out.println("Your answer is incorrect. The answer is: " + randNum);
                    points -= 50;
                    System.out.println("Your current points: " + points);
                }
            }
        }
        return points;
    }
    
    // Mathematical methods
    public static int factorial(int[] arr) {
        int total = 1;
        for (int i = arr[0]; i > 0; i--) {
            total *= i;
        }
        return total;
    }

    public static double average(int[] arr) {
        double avg;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (double) sum / arr.length;
        return avg;
    }

    public static int averageQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int[] avgInts = randNumbers(5);
        String avgIntsString = randNumberString(avgInts);
        System.out.print("What is the average for this set of numbers: " + avgIntsString + "\nYour answer: ");
        double userInput = input.nextDouble();
        if (userInput != average(avgInts)) {
            while (userAttempts > 0 && userInput != average(avgInts)) {
                printMessages(motivationMessages);
                System.out.println("Number of attempts remaining: " + userAttempts);
                System.out.print("Your answer: ");
                userInput = input.nextFloat();
                if (userInput == average(avgInts)) {
                    printMessages(congratsMessages);
                    points += difficulty;
                    System.out.println("Your current points: " + points);
                    // Secret question
                    points = secretQuestion(points, congratsMessages);
                }
                userAttempts--;
            }
            if (userAttempts == 0 && userInput != average(avgInts)) {
                System.out.println("Your answer is incorrect. The answer is: " + average(avgInts));
                points -= difficulty;
                System.out.println("Your current points: " + points);
            }
        } else {
            printMessages(congratsMessages);
            points += difficulty;
            System.out.println("Your current points: " + points);
            // Secret question
            points = secretQuestion(points, congratsMessages);
        }
        return points;
    }

    public static int factorialQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int[] ints = randNumbers(1);
        String intsString = randNumberString(ints);
        System.out.print("What is the factorial of this number: " + intsString + "\nYour answer: ");
        double userInput = input.nextDouble();
        if (userInput != factorial(ints)) {
            while (userAttempts > 0 && userInput != factorial(ints)) {
                printMessages(motivationMessages);
                System.out.println("Number of attempts remaining: " + userAttempts);
                System.out.print("Your answer: ");
                userInput = input.nextFloat();
                if (userInput == average(ints)) {
                    printMessages(congratsMessages);
                    points += difficulty;
                    System.out.println("Your current points: " + points);
                    // Secret question
                    points = secretQuestion(points, congratsMessages);
                }
                userAttempts--;
            }
            if (userAttempts == 0 && userInput != factorial(ints)) {
                System.out.println("Your answer is incorrect. The answer is: " + factorial(ints));
                points -= difficulty;
                System.out.println("Your current points: " + points);
            }
        } else {
            printMessages(congratsMessages);
            points += difficulty;
            System.out.println("Your current points: " + points);
            // Secret question
            points = secretQuestion(points, congratsMessages);
        }
        return points;
    }
}

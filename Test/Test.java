import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int points = 50;
        runTest(points);
    }

    public static int[] randNumbers(int n) {
        int[] randNumberList = new int[n];
        for (int i = 0; i < randNumberList.length; i++) {
            randNumberList[i] = (int)(Math.random() * 20);
        }
        return randNumberList;
    }

    public static String randNumberString(int[] arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str;
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

    public static void runTest(int points) {
        Scanner input = new Scanner(System.in);
        int[] avgInts = randNumbers(10);
        String avgIntsString = randNumberString(avgInts);
        System.out.print("What is the average for this set of numbers: " + avgIntsString + "\nYour answer: ");
        double userInput = input.nextDouble();
        if (userInput != average(avgInts)) {
            while (userAttempts > 0 && userAnswer != avg) {
                printMessages(congratsMessages);
                System.out.println("Number of attempts remaining: " + userAttempts);
                System.out.print("Your answer: ");
                userAnswer = input.nextFloat();
                if (userAnswer == avg) {
                  printMessages(congratsMessages);
                  userPoints += EASY;
                  System.out.println("Your current points: " + userPoints);

                  // Secret question
                  if (Math.random() <= 0.5) {
                    System.out.println(secretQuestion);
                    System.out.print("Your answer: ");
                    userAns = input.next().toLowerCase();
                    if (userAns.equals("hayden")) {
                        printMessages(congratsMessages);
                        userPoints += secretQuestionPoint;
                        System.out.println("Your current points: " + userPoints);
                    }
                  }

                }
                userAttempts--;
            }
            if(userAttempts == 0 && userAnswer != avg){
              System.out.println("Your answer is incorrect. The answer is: " + avg);
              userPoints -= EASY;
              System.out.println("Your current points: " + userPoints);
            }
          } else {
              printMessages(congratsMessages);
              userPoints += EASY;
              System.out.println("Your current points: " + userPoints);

              // Secret question
              if (Math.random() <= 0.5) {
                System.out.println(secretQuestion);
                System.out.print("Your answer: ");
                userAns = input.next().toLowerCase();
                if (userAns.equals("hayden")) {
                    printMessages(congratsMessages);
                    userPoints += secretQuestionPoint;
                    System.out.println("Your current points: " + userPoints);
                }
              }
            }
        System.out.println("Correct average: " + average(avgInts));
        System.out.println("Points: " + points);
    }
}

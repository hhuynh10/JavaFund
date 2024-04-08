//import API's needed here:
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Project {
  public static void main(String args[]) {
    // create any objects if needed (i.e. scanner for keyboard input)
    Scanner input = new Scanner(System.in);
    DecimalFormat fm = new DecimalFormat("0.00");
    Random mystery = new Random();

    // declare data storage space (constants and variables)
    final int EASY = 10; // Points for easy questions
    final int MEDIUM = 15; // Points for medium questions
    final int HARD = 20; // Point for hard questions

    int userPoints; // User's starting points
    int userAttempts; // User's attempts for each question

    String welcome = "Welcome to Java Beans' Project"; // Welcoming string

    String gameRules = "Starting Points: Players begin their gaming journey with an initial pool of 50 points.\n"
        + "Difficulty Levels: Players have the flexibility to choose questions from three distinct difficulty levels: Easy, Medium, and Hard. Each level corresponds to a specific point value: 5 points for Easy, 10 points for Medium, and 15 points for Hard questions.\n"
        + "Attempts: Players are granted three attempts to respond to each question.\n"
        + "Point System:\n"
        + "A correct answer results in point accumulation based on the difficulty level of the question.\n"
        + "Easy questions earn 5 points, Medium questions earn 10 points, and Hard questions earn 15 points.\n"
        + "An incorrect answer incurs a deduction in points.\n"
        + "Game Restart:\n"
        + "The game restarts when the player accumulates 150 points.\n"
        + "The game also restarts if the player reaches zero points due to a loss.\n"; // Game rules

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
      }; //congrats messages

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
    }; //motivational messages

    String secretQuestion = "Mirror Mirror on the wall, who's the prettiest of them all?";
    int secretQuestionPoint = 50;
    
    int hints = 2;

    String userAns; // User answer

    // get input as required by program specifications
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


    do{
        // intializing game data
        userPoints = 50;
    do{

      userAttempts = 2;
    System.out.print("Would you like to choose easy, medium or hard question?\n" + "(E)asy, (M)edium, or (H)ard? ");
      userAns = input.nextLine().toLowerCase();
    
// process data as required by program specifications
      if (userAns.length() > 0 && userAns.charAt(0) == 'e') {
        // question 1
        System.out.print("What is the average of the following numbers, answer in nearest tenth: " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + " ?\n" + "Your answer: ");
        userAnswer = input.nextFloat();
            if (userAnswer != avg) {
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
              //MEDIUM QUESTIONS
      } else if (userAns.length() > 0 && userAns.charAt(0) == 'm') {
        System.out.println("incoming...");

      } else if (userAns.length() > 0 && userAns.charAt(0) == 'h') {
        System.out.println("incoming...");
      }
      input.nextLine();


      
    } while (0 < userPoints && userPoints < 150 );
      userPoints = 50;
      userAttempts = 2;
      hints = 2;

      System.out.print("Do you want to (R)estart or press any key to exit? ");
      userAns = input.nextLine().toLowerCase();
      if (userAns.length() > 0 && userAns.charAt(0) == 'r'){
        System.out.println("Game restarting now!");
      }
    } while (userAns.length() > 0 && userAns.charAt(0)== 'r');
    

    System.out.println("Thanks for playing!");

  } // closing main method


  // Methods
  //General methods
  public static void printMessages(String message){
    System.out.println(message);
  }

  public static void printMessages(String[] messageList){
    System.out.println(messageList[(int)Math.random() * messageList.length]);
  }

  public static int[] randNumbers(int n){
    int[] randNumberList = new int[n];
    for (int i = 0; i < randNumberList.length; i++){
      randNumberList[i] = (int)(Math.random() * 20);
    }
    return randNumberList;
  }

  //Easy question methods
  public static double average(int[] arr) {
    double avg;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    avg = (double) sum / arr.length;
    return avg;
}

  public static int factorial (int num){
    int total = 1;
    for (int i = num; i > 0; i--){
        total *= i;
    }
    return total;
  }
}
// closing class header`




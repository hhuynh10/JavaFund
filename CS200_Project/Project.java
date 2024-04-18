import java.util.Scanner;
import java.math.BigInteger;

public class Project {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        final int EASY = 5;
        final int MEDIUM = 10;
        final int HARD = 20;

        int userPoints;
        int userAttempts;
        String userAns;
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
        printGameRules(gameRules);

        do {
            userPoints = 50;
            do {
                userAttempts = 2;
                // randomQuestions = (int)(Math.random() * 5);
                randomQuestions = 6;
                System.out.print("Would you like to choose easy, medium or hard question?\n" + "(E)asy, (M)edium, or (H)ard? ");
                userAns = input.nextLine().toLowerCase();

                while (userAns.charAt(0) != 'e' && userAns.charAt(0) != 'm' && userAns.charAt(0) != 'h') {
                    System.out.println("Invalid input!!!");
                    System.out.print("Would you like to choose easy, medium or hard question?\n" + "(E)asy, (M)edium, or (H)ard? ");
                    userAns = input.nextLine().toLowerCase();
                }

                if (userAns.length() > 0 && userAns.charAt(0) == 'e') {
                    switch(randomQuestions){
                        case 0:
                        userPoints = factorialQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, EASY);
                        break;
                        case 1:
                        userPoints = averageQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, EASY);
                        break;
                        case 2:
                        userPoints = isPrimeQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, EASY);
                        break;
                        case 3:
                        userPoints = tempConversionQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, EASY);
                        break;
                        case 4:
                        userPoints = isArmstrongQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, EASY);
                        break;
                        case 5:
                        userPoints = findNumQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, MEDIUM);
                        break;
                        case 6:
                        userPoints = areaQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, EASY);
                        break;
                    }
                } else if (userAns.length() > 0 && userAns.charAt(0) == 'm') {
                    switch(randomQuestions){
                        case 0:
                        userPoints = gcdQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, MEDIUM);
                        break;
                        case 1:
                        userPoints = lcmQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, MEDIUM);
                        break;
                        case 2:
                        userPoints = binomialCoefficientQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, MEDIUM);
                        break;
                        case 3:
                        userPoints = arithmeticProgressionQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, MEDIUM);
                        break;
                        case 4:
                        userPoints = bankingQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, MEDIUM);
                        break;
                    }
                } else if (userAns.length() > 0 && userAns.charAt(0) == 'h') {
                    switch(randomQuestions){
                        case 0:
                        userPoints = baseConversionQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, HARD);
                        break;
                        case 1:
                        userPoints = romanConversionQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, HARD);
                        break;
                        case 2:
                        userPoints = standardDeviationQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, HARD);
                        break;
                        case 3:
                        userPoints = highestSumQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, HARD);
                        break;
                        case 4:
                        userPoints = geometricProgressionQuestion(userPoints, userAttempts, congratsMessages, motivationalMessages, HARD);
                        break;
                    }
                }
            } while (0 < userPoints && userPoints < 150);
            
            if (userPoints >= 150){
                System.out.println("CONGRATULATIONS!!! YOU'VE WON!!!");
            } else if (userPoints <= 0){
                System.out.println("YOU'VE LOST!!!");
            }

            userPoints = 50;
            userAttempts = 2;
            System.out.print("Do you want to (R)estart or (E)xit the game? ");
            userAns = input.nextLine().toLowerCase();
            while (userAns.charAt(0) != 'r' && userAns.charAt(0) != 'e') {
                System.out.print("Do you want to (R)estart or (E)xit the game? ");
                userAns = input.nextLine().toLowerCase();
            }
            if (userAns.length() > 0 && userAns.charAt(0) == 'r') {
                System.out.println("Game restarting now!");
            }
        } while (userAns.length() > 0 && userAns.charAt(0) == 'r');
        
        System.out.println("Thank you for playing!");
    }

    // GENERAL METHODS
    public static void printGameRules(String gameRules){
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to go over the game rules?\n" + "(Y)es or (N)o? ");
        String userInput = input.nextLine().toLowerCase();
        while (userInput.charAt(0) != 'y' && userInput.charAt(0) != 'n') {
            System.out.print("Would you like to go over the game rules?\n" + "(Y)es or (N)o? ");
            userInput = input.nextLine().toLowerCase();
        }
        if (userInput.charAt(0) == 'y') {
            printMessages(gameRules);
        }
    }

    public static void printMessages(String message) {
        System.out.println(message);
    }

    public static void printMessages(String[] messageList) {
        System.out.println(messageList[(int)(Math.random() * messageList.length)]);
    }

    public static int randNumbers(int range) {
        int randInt = (int)(Math.random() * range) + 1;
        return randInt;
    }

    public static double randNumbers(double range) {
        double randInt = Math.round((Math.random() * range) * 100.0) / 100.0 + 1;
        return randInt;
    }

    public static int[] randNumbers(int numbers, int range) {
        int[] randNumberList = new int[numbers];
        for (int i = 0; i < randNumberList.length; i++) {
            randNumberList[i] = (int)(Math.random() * range) + 1;
        }
        return randNumberList;
    }

    public static double[] randNumbers(int numbers, double range) {
        double[] randNumberList = new double[numbers];
        for (int i = 0; i < randNumberList.length; i++) {
            randNumberList[i] = Math.round((Math.random() * range) * 100.0) / 100.0 + 1;
        }
        return randNumberList;
    }

    public static int[][] nestedListGenerator(int numbers, int range) {
        int[][] randNestedNumberList = new int[numbers][numbers];
        for (int i = 0; i < randNestedNumberList.length; i++) {
            for (int j = 0; j < randNestedNumberList[i].length; j++) {
                randNestedNumberList[i][j] = (int) (Math.random() * range) + 1;
            }
        }
        return randNestedNumberList;
    }

    public static String randNumberString(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str.toString();
    }

    public static String randNumberString(double[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str;
    }

    public static int secretQuestion(int points, String[] congratsMessages) {
        if (Math.random() <= 0.1 && points < 150) {
            Scanner input = new Scanner(System.in);
            System.out.println("YOU GOT A SECRET QUESTION!!!\n(if answer correctly +50 points, otherwise -50 points)");
            System.out.print("Would you like to risk? (Y)es or (N)o? ");
            String userInput = input.nextLine().toLowerCase();
            while (userInput.charAt(0) != 'y' && userInput.charAt(0) != 'n') {
                System.out.print("Would you like to risk? (Y)es or (N)o? ");
                userInput = input.nextLine().toLowerCase();
            }
            if (userInput.equals("y")) {
                int randNum = (int)(Math.random() * 10);
                System.out.print("Guess a random number from 0 - 9: ");
                userInput = input.nextLine().trim();
                if (userInput.equals(Integer.toString(randNum))) {
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
    
    public static int compareResult(int points, String userInput, String result, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        if (!userInput.equals(result)) {
            while (userAttempts > 0 && !userInput.equals(result)) {
                printMessages(motivationMessages);
                System.out.println("Number of attempts remaining: " + userAttempts);
                System.out.print("Your answer: ");
                userInput = input.nextLine().trim();
                if (userInput.equals(result)) {
                    printMessages(congratsMessages);
                    points += difficulty;
                    System.out.println("Your current points: " + points);
                    points = secretQuestion(points, congratsMessages);
                }
                userAttempts--;
            }
            if (userAttempts == 0 && !userInput.equals(result)) {
                System.out.println("Your answer is incorrect. The answer is: " + result);
                points -= difficulty;
                System.out.println("Your current points: " + points);
            }
        } else {
            printMessages(congratsMessages);
            points += difficulty;
            System.out.println("Your current points: " + points);
            points = secretQuestion(points, congratsMessages);
        }
        return points;
    }


    // MATHEMATICAL METHODS
    // EASY QUESTION METHODS
    // 1. Factorial
    public static String factorial(int number) {
        if (number == 0 || number == 1)
        return Integer.toString(1);
        int total = 1;
        for (int i = number; i > 0; i--) {
            total *= i;
        }
        return Integer.toString(total);
    }    

    public static int factorialQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int num = randNumbers(10);
        System.out.print("What is the Factorial of this number: " + num + "\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = factorial(num);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 2. Average
    public static String average(int[] arr) {
        double avg;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (double) sum / arr.length;
        return Double.toString(avg);
    }    

    public static int averageQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int[] numList = randNumbers(5,500);
        String numString = randNumberString(numList);
        System.out.print("What is the Average for this set of numbers (1 decimal place): " + numString + "\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = average(numList);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 3. IsPrime
    public static String isPrime(int num) {
        if (num <= 1) {
            return Boolean.toString(false);
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return Boolean.toString(false);
            }
        }
        return Boolean.toString(true);
    }

    public static int isPrimeQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        userAttempts = 0;
        Scanner input = new Scanner(System.in);
        int num = randNumbers(1000);
        System.out.print("Is this number " + num + " a Prime number? (True for Yes and False for No)" + "\nYour answer: ");
        String userInput = input.nextLine().trim().toLowerCase();
        String result = isPrime(num);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 4. Temperature Conversion
    public static String celsiusToFahrenheit(int c) {
        double result = (c * 9.0 / 5.0) + 32.0;
        double roundedResult = Math.round(result * 10.0) / 10.0;
        return Double.toString(roundedResult);
    }

    public static String fahrenheitToCelsius (int f){
        double result = (f - 32.0) * 5.0 / 9.0;
        double roundedResult = Math.round(result * 10.0) / 10.0;
        return Double.toString(roundedResult);
    }

    public static int tempConversionQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int randNum = (int)(Math.random() * 2);
        int temp = randNumbers(200);
        System.out.print("Convert this temperature " + temp + (randNum == 1 ? " to Fahrenheit" : " to Celsius") + " (round to 1 decimal places)" + "\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = randNum == 1 ? celsiusToFahrenheit(temp) : fahrenheitToCelsius(temp);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 5. Armstrong Number
    public static String isArmstrong(int num, int power){
        int originalNum = num;
        int sum = 0;
        while (num > 0 ){
            int digit = num % 10;
            sum += Math.pow(digit, power);
            num /= 10;
        }
        if (originalNum == sum){
            return Boolean.toString(true);
        }
        return Boolean.toString(false);
    }

    public static int isArmstrongQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        userAttempts = 0;
        Scanner input = new Scanner(System.in);
        int num = randNumbers(99989) + 10;
        int power = 0;
        if (num >= 10000){
            power = 5;
        } else if (num >= 1000){
            power = 4;
        } else if (num >= 100){
            power = 3;
        } else if (num >= 10){
            power = 2;
        }
        System.out.print("Is this number " + num + " an Armstrong number? (True for Yes and False for No)" + "\nYour answer: ");
        String userInput = input.nextLine().trim().toLowerCase();
        String result = isArmstrong(num, power);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 6. Sort and Find Index
    public static String findNum(int[] numList, int num){
        for (int i = 0; i < numList.length-1; i++){
            int minIndex = i;
            int minValue = numList[i];
            for (int j = i + 1; j < numList.length; j++){
                if (numList[j] < minValue){
                    minIndex = j;
                    minValue = numList[j];
                }
            }
            if (i != minIndex){
                int temp = numList[i];
                numList[i] = numList[minIndex];
                numList[minIndex] = temp;
            }
        }

        int low = 0;
        int high = numList.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (numList[mid] < num){
                low = mid + 1;
            } else if (numList[mid] > num){
                high = mid - 1;
            } else {
                return Integer.toString(mid);
            }
        }
        return Integer.toString(-1);
    }

    public static int findNumQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int[] numList = randNumbers(25, 1000);
        int num = numList[(int)(Math.random() * numList.length)]; 
        String numString = randNumberString(numList);
        System.out.print("Sort in a none decreasing order and find the index of this number " + num + " in this array:\n" + numString + "\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = findNum(numList, num);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 7. Area of different figures
    public static String squareArea(double side) {
        double result = Math.pow(side, 2);
        double roundedResult = Math.round(result * 10.0) / 10.0;
        return Double.toString(roundedResult);
    }

    public static String rectangularArea(double length, double width) {
        double result = length * width;
        double roundedResult = Math.round(result * 10.0) / 10.0;
        return Double.toString(roundedResult);
    }

    public static String triangleArea(double base, double height) {
        double result = 0.5 * base * height;
        double roundedResult = Math.round(result * 10.0) / 10.0;
        return Double.toString(roundedResult);
    }

    public static String circleArea(double radius) {
        double result = Math.PI * Math.pow(radius, 2);
        double roundedResult = Math.round(result * 10.0) / 10.0;
        return Double.toString(roundedResult);
    }

    public static String cylinderArea(double radius, double height) {
        double result = 2 * Math.PI * radius * (radius + height);
        double roundedResult = Math.round(result * 10.0) / 10.0;
        return Double.toString(roundedResult);
    }

    public static int areaQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int randNum = (int)(Math.random() * 5);
        String result = "";
        switch(randNum){
            case 0: 
            double side = randNumbers(20.0);
            System.out.print("Find the area of this Square figure (round to 1 decimal places)\n" + "Side: " + side + "\nYour answer: ");
            result = squareArea(side);
            break;
            case 1: 
            double length = randNumbers(20.0);
            double width = randNumbers(20.0);
            System.out.print("Find the area of this Rectangular figure (round to 1 decimal places)\n" + "Length: " + length + " and Width: " + width + "\nYour answer: ");
            result = rectangularArea(length, width);
            break;
            case 2: 
            double base = randNumbers(20.0);
            double height = randNumbers(20.0);
            System.out.print("Find the area of this Triangle figure (round to 1 decimal places)\n" + "Base: " + base + " and Height: " + height + "\nYour answer: ");
            result = triangleArea(base, height);
            break;
            case 3: 
            double radius = randNumbers(20.0);
            System.out.print("Find the area of this Circle figure (round to 1 decimal places)\n" + "Radius: " + radius + "\nYour answer: ");
            result = circleArea(radius);
            break;
            case 4: 
            double radius1 = randNumbers(20.0);
            double height1 = randNumbers(20.0);
            System.out.print("Find the area of this Cylinder figure (round to 1 decimal places)\n" + "Radius: " + radius1 + " and Height: " + height1 + "\nYour answer: ");
            result = cylinderArea(radius1, height1);
            break;
        }
        String userInput = input.nextLine().trim();
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }


    // MEDIUM QUESTION METHODS
    // 1. Greatest Common Divisor
    public static String gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return Integer.toString(num1);
    }

    public static int gcdQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int num1 = randNumbers(500);
        int num2 = randNumbers(250);
        System.out.print("What is the Greatest Common Divisor of these number: " + num1 + " and " + num2 + "\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = gcd(num1, num2);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 2. Least Common Multiple
    public static String lcm(int num1, int num2) {
        int lcm = (num1 * num2) / Integer.parseInt(gcd(num1, num2));
        return Integer.toString(Math.abs(lcm));
    }

    public static int lcmQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int num1 = randNumbers(250);
        int num2 = randNumbers(125);
        System.out.print("What is the Least Common Multiple of these number: " + num1 + " and " + num2 + "\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = lcm(num1, num2);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 3. Binomial Coefficient
    public static BigInteger factorial(long number) {
        if (number == 0 || number == 1) {
            return BigInteger.ONE;
        }
        BigInteger total = BigInteger.ONE;
        for (long i = 2; i <= number; i++) {
            total = total.multiply(BigInteger.valueOf(i));
        }
        return total;
    }

    public static String binomialCoefficient(long n, long k) {
        BigInteger result = factorial(n).divide(factorial(k).multiply(factorial(n - k)));
        return result.toString();
    }

    public static int binomialCoefficientQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int n = randNumbers(90) + 9;
        int k = randNumbers(9);
        System.out.print("What is the Binomial Coefficient of these number: " + n + " and " + k + "\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = binomialCoefficient(n, k);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 4. Arithmetic Progression Sum
    public static String arithmeticProgression(int firstTerm, int commonDifference, int numberOfTerms) {
        int lastTerm = firstTerm + (numberOfTerms - 1) * commonDifference;
        int sum = (numberOfTerms * (firstTerm + lastTerm)) / 2;
        return Integer.toString(sum);
    }

    public static int arithmeticProgressionQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int firstTerm = randNumbers(9);
        int commonDifference = randNumbers(9);
        int numberOfTerms = randNumbers(9);
        System.out.print("Calculate sum of the arithmetic progression up to the " + numberOfTerms + "th term with " + firstTerm + " is the first term and " + commonDifference + " is the common difference" + "\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = arithmeticProgression(firstTerm, commonDifference, numberOfTerms);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 5. Geometric Progression Sum
    public static String geometricProgression(int firstTerm, int commonRatio, int numberOfTerms) {
        double sum = firstTerm * (1 - Math.pow(commonRatio, numberOfTerms)) / (1 - commonRatio);
        return Integer.toString((int)sum);
    }

    public static int geometricProgressionQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int firstTerm = randNumbers(9);
        int commonRatio = randNumbers(9);
        int numberOfTerms = randNumbers(9);
        System.out.print("Calculate sum of the geometric progression up to the " + numberOfTerms + "th term with " + firstTerm + " is the first term and " + commonRatio + " is the common difference" + "\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = geometricProgression(firstTerm, commonRatio, numberOfTerms);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 7. Banking
    public static String banking(double amount, double rate, int year) {
        double result = amount * Math.pow(1 + rate / 100, year);
        double roundedResult = Math.round(result * 100.0) / 100.0; 
        return Double.toString(roundedResult);
    }

    public static int bankingQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        double amount = randNumbers(10000.0);
        double rate = randNumbers(10.0);
        int year = randNumbers(50);
        System.out.print("If you deposit $" + amount + " in your bank account with an interest of " + rate + "%\nHow much money will you earn in " + year + " year(s)? (round to 2 decimal places)\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = banking(amount, rate, year);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // HARD QUESTION METHODS
    // 1. Base Conversion
    public static String baseConversion(int num, int base){
        String str = "";
        while (num > 0){
            int quotient = num / base;
            int remainder = num % base;
            if (remainder == 10){
                str += "A";
            } else if (remainder == 11){
                str += "B";
            } else if (remainder == 12){
                str += "C";
            } else if (remainder == 13){
                str += "D";
            } else if (remainder == 14){
                str += "E";
            } else if (remainder == 15){
                str += "F";
            } else {
                str += remainder;
            }
            num = quotient;
        }
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static int baseConversionQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int num = randNumbers(3000);
        int[] baseList = {2, 8, 16};
        int base = baseList[(int)(Math.random() * baseList.length)];
        System.out.print("Convert this number " + num + " into base " + base + "\nYour answer: ");
        String userInput = input.nextLine().trim().toUpperCase();
        String result = baseConversion(num, base);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 2. Roman Numeral Conversion
    public static String romanConversion(int num) {
        String[][] symbolList = {
            {"M", "1000"},
            {"CM", "900"},
            {"D", "500"},
            {"CD", "400"},
            {"C", "100"},
            {"XC", "90"},
            {"L", "50"},
            {"XL", "40"},
            {"X", "10"},
            {"IX", "9"},
            {"V", "5"},
            {"IV", "4"},
            {"I", "1"}
        };
        String result = "";
        for (String[] pair : symbolList) {
            String symbol = pair[0];
            int value = Integer.parseInt(pair[1]);
            while (num >= value) {
                result += symbol;
                num -= value;
            }
        }
        return result;
    }

    public static int romanConversionQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int num = randNumbers(2000);
        System.out.print("Convert this number " + num + " into Roman Numeral " + "\nYour answer: ");
        String userInput = input.nextLine().trim().toUpperCase();
        String result = romanConversion(num);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 3. Standard Deviation
    public static double mean(double[] numList){
        double total = 0.0;
        for (int i = 0; i < numList.length; i++){
                total += numList[i];
        }
        double mean = total / numList.length;
        return mean;
    }

    public static String standardDeviation(double[] numList){
        double sum = 0.0;
        for (int i = 0; i < numList.length; i++){
                sum += Math.pow(numList[i] - mean(numList), 2);
        }
        double standardDeviation = Math.sqrt(sum / numList.length);
        double roundedResult = Math.round(standardDeviation * 100.0) / 100.0;
        return Double.toString(roundedResult);
    }

    public static int standardDeviationQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        double[] numList = randNumbers(10,200.0);
        String numString = randNumberString(numList);
        System.out.print("What is the standard deviation for this set of numbers (round to 2 decimal places): " + numString + "\nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = standardDeviation(numList);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }

    // 4. Highest Sum 
    public static String highestSum(int[][] nestedList){
        int max = 0;
        for (int i = 0 ; i < nestedList.length; i++){
            int rowTotal = 0;
            for (int j = 0; j < nestedList[i].length; j++){
                rowTotal += nestedList[i][j];
            }
            max = Math.max(max, rowTotal);
        }
        return Integer.toString(max);
    }

    public static int highestSumQuestion(int points, int userAttempts, String[] congratsMessages, String[] motivationMessages, int difficulty) {
        Scanner input = new Scanner(System.in);
        int length = randNumbers(4) + 10;
        int[][] nestedNumList = nestedListGenerator(length, 500);
        for (int i = 0; i < nestedNumList.length; i++){
            for (int j = 0 ; j < nestedNumList.length; j++){
                System.out.printf("%-6d", nestedNumList[i][j]);
            }
            System.out.println();
        }
        System.out.print("From the nested array above, find the row with the highest sum then return that sum. \nYour answer: ");
        String userInput = input.nextLine().trim();
        String result = highestSum(nestedNumList);
        points = compareResult(points, userInput, result, userAttempts, congratsMessages, motivationMessages, difficulty);
        return points;
    }
}
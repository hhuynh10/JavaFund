import java.util.Scanner;
public class Runners {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] runnerNames = new String[3];
        double[] runnerTimes = new double[3];

        for (int i = 0; i < runnerNames.length; i++){
            System.out.print("Enter runner's name: ");
            runnerNames[i] = input.next();
            System.out.print("Enter runner's time: ");
            runnerTimes[i] = input.nextDouble();
            while (runnerTimes[i] < 0){
                System.out.print("Invalid input! \nEnter runner's time: ");
                runnerTimes[i] = input.nextDouble();
            }
        }

        for (int i = 0 ; i < runnerTimes.length; i++){
            for (int j = 0; j < runnerTimes.length - 1 - i; j++){
                if (runnerTimes[j] > runnerTimes[j+1]){
                    double temp = runnerTimes[j];
                    runnerTimes[j] = runnerTimes[j+1];
                    runnerTimes[j+1] = temp;

                    String temp1 = runnerNames[j];
                    runnerNames[j] = runnerNames[j+1];
                    runnerNames[j+1] = temp1;
                }
            }
        }

        for (int i = 0; i < runnerNames.length; i++){
            System.out.println("Runner " + runnerNames[i] + " finished the race with " + runnerTimes[i] + " minutes. Ranked: " + (i+1));
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] userList = new double[3];

        int i = 0;
        while (i < userList.length){
            System.out.print("Enter value: ");
            userList[i] = input.nextDouble();
            i++;
        }

        if (userList[0] < userList[1] && userList[1] < userList[2]){
            System.out.println("INCREASING!");
        } else if (userList[0] > userList[1] && userList[1] > userList[2]){
            System.out.println("DECREASING!");
        } else {
            System.out.println("NEITHER!");
        }
    }
}

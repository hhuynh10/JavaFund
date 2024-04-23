import java.util.Arrays;

public class Problem {
    public static void main (String[] args){
        int[][] employeeData = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        sort(totalHours(employeeData));
    }

    public static int[] totalHours(int[][] employeeData){
        int[] hours = new int[employeeData.length];
        for (int i = 0; i < employeeData.length; i++){
            int total = 0;
            for (int j = 0; j < employeeData[i].length; j++){
                total += employeeData[i][j];
            }
            hours[i] = total;
        }
        return hours;
    }

    public static void sort(int[] hours){
        int[] newHours = new int[hours.length];
        for (int i = 0; i < hours.length; i++){
            newHours[i] = i;
        }

        for (int i = 0; i < hours.length; i++){
            for (int j = 0; j < hours.length - 1- i; j++){
                if (hours[j] < hours[j+1]){
                    int temp = hours[j];
                    hours[j] = hours[j+1];
                    hours[j+1] = temp;

                    int temp1 = newHours[j];
                    newHours[j] = newHours[j+1];
                    newHours[j+1] = temp1;
                }
            }
        }

        for (int i = 0 ; i < hours.length; i++){
            System.out.println("Employee " + newHours[i] + "'s hours count is " +
            hours[i]);
        }
    }
}

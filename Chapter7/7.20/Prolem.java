import java.util.Arrays;
import java.util.Scanner;
public class Prolem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] list = new double[10];
        System.out.print("Enter 10 real numbers: ");
        for (int i = 0; i < list.length; i++){
            list[i] = input.nextDouble();
        }

        System.out.println(Arrays.toString(selectionSortAsc(list)));
        System.out.println(Arrays.toString(selectionSortDes(list)));
    }
    public static double[] selectionSortAsc(double[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMinIndex = i;
            double currentMinVal = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (currentMinVal > list[j]) {
                    currentMinIndex = j;
                    currentMinVal = list[j];
                }
            }
    
            if (currentMinIndex != i) {
                double temp = list[i];
                list[i] = list[currentMinIndex];
                list[currentMinIndex] = temp;
            }
        }
        return list;
    }
    
    public static double[] selectionSortDes(double[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMinIndex = i;
            double currentMinVal = list[i];
            for (int j = i + 1; j < list.length; j++) {
                if (currentMinVal < list[j]) {
                    currentMinIndex = j;
                    currentMinVal = list[j];
                }
            }
    
            if (currentMinIndex != i) {
                double temp = list[i];
                list[i] = list[currentMinIndex];
                list[currentMinIndex] = temp;
            }
        }
        return list;
    }
}

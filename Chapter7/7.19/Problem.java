import java.util.Arrays;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list;

        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();
        list = new int[size];
        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        System.out.print("The list has " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }

        if (isSorted(list)) {
            System.out.println("\nThe list is already sorted");
        } else {
            System.out.println("\nThe list is not sorted");
        }
    }

    public static boolean isSorted(int[] list) {
        int[] newList = new int[list.length];
        System.arraycopy(list, 0, newList, 0, list.length);
        for (int i = 0; i < newList.length; i++) {
            for (int j = 0; j < newList.length - i - 1; j++) {
                if (newList[j] > newList[j + 1]) {
                    int temp = newList[j];
                    newList[j] = newList[j + 1];
                    newList[j + 1] = temp;
                }
            }
        }
        return Arrays.equals(list, newList);
    }
}

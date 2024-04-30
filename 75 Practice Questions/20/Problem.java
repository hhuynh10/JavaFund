import java.util.Arrays;

public class Problem {
    public static void main(String[] args){
        double[] arr = {1.5, 2.0, 1.0, 9.0, 1.5, 9.5, 2.5};
        System.out.println(Arrays.toString(separate(arr)));
    }

    public static double [] separate(double [] arr) {
        double[] newArr = new double[arr.length + 1];
        double sum = 0.0;
        for (double num : arr){
            sum += num;
        }
        double avg = Math.round(sum / arr.length * 10.0) / 10.0;

        int leftIndex = 0;
        int rightIndex = newArr.length - 1;

        for (double num : arr){
            if (num < avg){
                newArr[leftIndex] = num;
                leftIndex++;
            } else if (num > avg) {
                newArr[rightIndex] = num;
                rightIndex--;
            }
        }
        newArr[leftIndex] = avg;
        return newArr;
    }
}

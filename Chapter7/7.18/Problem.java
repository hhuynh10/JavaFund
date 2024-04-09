public class Problem {
    public static void main (String[] args){
        double[] numbersInput = new double[10];
        System.out.print("Random array: ");
        for (int i = 0; i < numbersInput.length; i++){
            numbersInput[i] = Math.random() * numbersInput.length;
            System.out.printf("%-5.2f", numbersInput[i]);
        }

        System.out.println();

        System.out.print("Sorted array: ");
        double[] sortedArr = bubbleSort(numbersInput);
        for (int i = 0; i < sortedArr.length; i++){
            System.out.printf("%-5.2f", sortedArr[i]);
        }
    }

    public static double[] bubbleSort(double[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}

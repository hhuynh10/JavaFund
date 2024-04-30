public class Problem {
    public static void main(String[] args){
        int[] arr = {20, 40, 15, 12, 7, 1, 56};
        System.out.println(sumOfOdds(arr));
    }

    public static int sumOfOdds(int [] myArray) {
        int sumOdd = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] % 2 != 0){
                sumOdd += myArray[i];
            }
        }
        return sumOdd;
    }
}

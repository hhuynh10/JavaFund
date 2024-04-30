public class Problem {
    public static void main(String[] args){
        int[] arr = {7, 20, 20, 7, 7, 5, 12, 12, 12, 12, 7, 1, 1, 1, 20};
        System.out.println(firstValueThreeInARow(arr));
    }

    public static int firstValueThreeInARow(int [] myArray) {
        for (int i = 0; i < myArray.length - 2; i++){
            if (myArray[i] == myArray[i+1] && myArray[i] == myArray[i+2]){
                return myArray[i];
            }
        }
        return -1;
    }
}

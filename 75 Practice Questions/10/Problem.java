public class Problem {
    public static void main(String[] args){
        int[] arr = {88, 88, 88, 63, 29, 77, 77, 77, 77, 50, 44, 44, 8, 0, 99, 99};
        System.out.println(indexOfFirstPair(arr));
    }

    public static int indexOfFirstPair(int[] myArray) {
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == myArray[i + 1]) {
                if ((i == 0 || myArray[i - 1] != myArray[i]) && (i + 2 >= myArray.length || myArray[i + 2] != myArray[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
}

public class Problem {
    public static void main(String[] args){
        int[] arr = {88, 88, 88, 63, 29, 77, 77, 77, 77, 50, 44, 44, 8, 0, 99, 99};
        System.out.println(indexOfFirstPair(arr));
    }

    int count = 0;
    public static int indexOfFirstPair(int[] myArray) {
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == myArray[i + 1]) {
                if (i == 0 || myArray[i] != myArray[i - 1]) {
                    return i;
                }
            }
        }

    }
    
}

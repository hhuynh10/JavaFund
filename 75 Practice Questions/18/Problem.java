public class Problem {
    public static void main(String[] args){
        int[] arr = {91, 81, 39, 17, 39, 17, 39, 17, 81, 81, 39, 5, 39, 39};
        System.out.println(mostFrequentValue(arr));
    }

    public static int mostFrequentValue(int [] myArray) {
        int max = 0;
        int maxNum = myArray[0];
        for (int i = 0; i < myArray.length; i++){
            int count = 0;
            for (int j = 0; j < myArray.length; j++){
                if (myArray[i] == myArray[j]){
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxNum = myArray[i];
            }
        }
        
        System.out.println(max);
        return maxNum;
    }
}

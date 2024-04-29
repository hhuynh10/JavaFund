public class Problem {
    public static void main(String[] args){
        int [] arr = {81, 81, 39, 17, 39, 17, 17, 17, 81, 81, 39, 5, 39, 39};
        System.out.println(longestRun(arr));
    }

    public static int longestRun(int [] myArray) {
        int max = 0;
        int i = 0;
        while (i < myArray.length){
            int j = i + 1;
            int count = 1;
            while (j < myArray.length && myArray[i] == myArray[j]){
                j++;
                count++;
            }
            if (max < count){
                max = count;
                System.out.println(myArray[i]);
            }
            i = j;
        }
        return max;
    }
}

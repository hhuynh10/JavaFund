public class Problem {
    public static void main(String[] args){
        int[] arr ={10, 50, 80, 70, 35, 60, 40};
        System.out.println(mostSmallerValuesToLeft(arr));
    }

    public static int mostSmallerValuesToLeft (int [] myNums) {
        int result = myNums[0];
        int max = 0;
        for (int i = 1; i < myNums.length; i++){
            int count = 0;
            for (int j = 0; j < i; j++){
                if (myNums[j] < myNums[i]){
                    count++;
                }
            }
            if (max < count){
                max = count;
                result = myNums[i];
            }
        }
        return result;
    }
}

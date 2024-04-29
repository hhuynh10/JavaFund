public class Problem {
    public static void main(String[] args){
        int[] arr1 = {33, 11, 77, 44, 55} ;
        int[] arr2 = {99, 88, 222, 44, 1000};
        System.out.println(largestInCommon(arr1, arr2));
    }

    public static int largestInCommon(int [] arr1, int [] arr2) {
        int max = -1;
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    max = Math.max(max, arr1[i]);
                }
            }
        }
        return max;
    }
}

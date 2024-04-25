public class Problem {
    public static void main (String[] args){
        int[][] arr = nestedList();
        display(arr);
        System.out.println("Highest sum: " + indexOfHighestRowSum(arr));
    }

    public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] nestedList() {
        int[][] nestedArr = new int[3][4];
        for (int i = 0; i < nestedArr.length; i++){
            for (int j = 0 ; j < nestedArr[i].length; j++){
                nestedArr[i][j] = (int)(Math.random() * 10);
            }
        }
        return nestedArr;
    }

    public static int indexOfHighestRowSum(int [][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            int currentTotal = 0;
            for (int j = 0 ; j < arr[i].length; j++){
                currentTotal += arr[i][j];
            }
            max = Math.max(max, currentTotal);
        }
        return max;
    }
}

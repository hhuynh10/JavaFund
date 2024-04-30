public class Problem {
    public static void main(String[] args){
        int[] arr1 = {5, 10, 2, 7};
        int[] arr2 = {1, 3, 9, 88, 5, 1, 1};
        int[] arr3 = {2, 9, 4, 11, 5, 13, 20, 99, 6};
        System.out.println(whichSumIsLarger(arr1));
        System.out.println(whichSumIsLarger(arr2));
        System.out.println(whichSumIsLarger(arr3));
    }

    public static int whichSumIsLarger(int [] myArray) {
        int even = 0;
        int odd = 0;
        int num;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] % 2 == 0){
                even += myArray[i];
            } else {
                odd += myArray[i];
            }
        }

        if (even > odd){
            System.out.println("EVENS ARE GREATER");
            num = 2;
        } else if (even < odd) {
            System.out.println("ODDS ARE GREATER");
            num = 3;
        } else {
            System.out.println("TIE");
            num = 7;
        }
        return num;
    }
}

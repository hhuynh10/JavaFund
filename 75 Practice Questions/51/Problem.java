public class Problem {
    public static void main(String[] args){
        int[] arr1 = {2, 6, 3};
        int[] arr2 = {3, 7, 3, 2, 12, 6};
        int[] arr3 = {2, 5, 3};
        System.out.println(sandwich(arr1));
        System.out.println(sandwich(arr2));
        System.out.println(sandwich(arr3));
    }

    public static int sandwich(int [] myArr) {
        int i;
        for (i = 0; i < myArr.length; i++){
            if ((1 <= i && i <= myArr.length-2) && myArr[i] == myArr[i-1] * myArr[i+1]){
                return i;
            }
        }
        return -1;
    }
}

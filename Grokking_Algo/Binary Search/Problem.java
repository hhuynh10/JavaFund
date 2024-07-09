public class Problem {
    public static void main(String[] args) {
        int[] list = {1, 4, 7, 2, 9};
        System.out.println(biSearch(list, 9));
    }

    public static int biSearch(int[] list, int target){
        int left = 0;
        int right = list.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            if (list[mid] < target){
                left = mid+1;
            } else if (list[mid] > target){
                right = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

public class Problem {
    public static void main(String[] args){
        System.out.println(howManyStepsToGetTo1(3));
    }

    public static int howManyStepsToGetTo1(int n) {
        int step = 0;
        while (n != 1){
            if (n % 2 == 0){
                n /= 2;
            } else if (n % 2 != 0){
                n = n * 3 + 1;
            }
            step++;
        }
        return step;
    }
}

public class Problem {
    public static void main(String[] args) {
        boolean[] arr ={true, false, false, false, false, true, false, true, true, true};

        System.out.println(longerTF(arr));
    }

    public static boolean longerTF (boolean [] guess) {
        int maxFalseCount = 0;
        int maxTrueCount = 0;

        int i = 0;
        while (i < guess.length){
            int falseCount = 1;
            int trueCount = 1;
            int j = i + 1;
            while (j < guess.length && guess[i] == true && guess[j] == true){
                j++;
                trueCount++;
            }
            if (trueCount > maxTrueCount){
                maxTrueCount = trueCount;
            }

            while (j < guess.length && guess[i] == false && guess[j] == false){
                j++;
                falseCount++;
            }
            if (falseCount > maxFalseCount){
                maxFalseCount = falseCount;
            }
            i = j;
        }
        return maxTrueCount > maxFalseCount ? true : false;
    }
}

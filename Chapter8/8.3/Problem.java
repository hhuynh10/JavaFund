import java.util.Arrays;

public class Problem {
    public static void main(String[] args){
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] scores = check(answers, keys);
        sort(scores);
    }

    public static int[] check(char[][] answers, char[] key){
        int[] scores = new int[answers.length];
        for (int i = 0 ; i < answers.length; i++){
            int correctAnswers = 0;
            for (int j = 0 ; j < answers[i].length; j++){
                if (answers[i][j] == key[j]){
                    correctAnswers++;
                }
            }
            scores[i] = correctAnswers;
        }
        return scores;
    }

    public static void sort(int[] scores){
        int[] oriScores = new int[scores.length];
        for (int i = 0; i < oriScores.length; i++){
            oriScores[i] = i;
        }

        for (int i = 0; i < scores.length; i++){
            for (int j = 0; j < scores.length - 1- i; j++){
                if (scores[j] > scores[j+1]){
                    int temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;

                    int temp1 = oriScores[j];
                    oriScores[j] = oriScores[j+1];
                    oriScores[j+1] = temp1;
                }
            }
        }

        for (int i = 0 ; i < scores.length; i++){
            System.out.println("Student " + oriScores[i] + "'s correct count is " +
            scores[i]);
        }
    }
}

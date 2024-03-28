// Import APIs as needed here

public class Problem {  

    public static void main(String[] args) {
        int i;
        int j;
        for (i = 33 ; i <= 126; i += 10){
            for (j = i; j <= i + 9 && j <= 126; j++){
                System.out.printf("%-4c", (char)j);
            }
            System.out.println();
        }
    } // Closing main method
} // Closing class header

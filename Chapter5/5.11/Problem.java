//import API's needed here:

public class Problem {  
    public static void main(String args[]) {   
        int i;
        int count = 0;
        int numPerLine = 10;

        for (i = 100; i <= 200; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                count += 0;
            } else if (i % 5 == 0 || i % 6 == 0){
                count++;
                if (count % numPerLine == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    } //closing main method
} //closing class header

package Chapter9.Problem6;
public class Main {
    public static void main(String[] args) {
        StopWatch input = new StopWatch();

        input.start();
        System.out.println(input.getStartTime());

        for (int i = 0; i <= 1000; i++){
            System.out.println(i);
        }

        input.stop();
        System.out.println(input.getEndTime());

        System.out.println(input.getElapsedTime());
        
    }
}

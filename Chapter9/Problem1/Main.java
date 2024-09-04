package Chapter9.Problem1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Problem1[] rectangle = new Problem1[2];
        for (int i = 0; i < 2; i++){
            System.out.print("Enter Height: ");
            int height = input.nextInt();
            System.out.print("Enter Width: ");
            int width = input.nextInt();

            rectangle[i] = new Problem1(height, width);
        }

        for (int i = 0; i < 2; i++){
            System.out.println("Rectangle " + (i+1) + " Area: " + rectangle[i].getArea() + " " + "Perimeter " + rectangle[i].getPerimeter());
        }
    }
}

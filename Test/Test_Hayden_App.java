import java.util.Scanner;
public class Test_Hayden_App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Rectangle would you like to create? ");
        int numArr = input.nextInt();

        MyRectangle2D[] rectangle = new MyRectangle2D[numArr];
        for (int i = 0; i < numArr; i++){
            System.out.println("Enter info of " + (i+1) + " Rectangle");
            System.out.print("Enter Height: ");
            double height = input.nextDouble();
            System.out.print("Enter Width: ");
            double width = input.nextDouble();

            rectangle[i] = new MyRectangle2D(height, width);
        }

        for(int i = 0; i < numArr; i++){
            System.out.print("Rectangle " + (i+1) + " - ");
            rectangle[i].print();
        }
    }
}

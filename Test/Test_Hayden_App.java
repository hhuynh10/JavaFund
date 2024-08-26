import java.util.Scanner;

public class Test_Hayden_App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter height and width!");
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        MyRectangle2D rec = new MyRectangle2D(height, width);
        rec.printRec();

        System.out.println("Enter updated height and width!");
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
        
        rec.setHeight(height);
        rec.setWidth(width);
        
        rec.printRec();
    }
}

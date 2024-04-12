package lab;

public class Lab {
    public static void main(String[] args){
        int x = 1;
        int y = 5;
        int z = 0;
        System.out.println(x);

        for (x = 1; x < y; x++){
            System.out.println(" + " + x);
            z += x;
        }
        System.out.println(" = " + z);
        
        while (x < y){
            System.out.println(" + " + x);
                z += x;
                x++;
        }
        System.out.println(" = " + z);

        do {
            System.out.println(" + " + x);
                z += x;
                x++;
        } while (x < y);
        System.out.println(" = " + z);
    }
}

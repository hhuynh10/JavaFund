package Chapter9.Problem5;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar input = new GregorianCalendar();
        System.out.println(input.get((GregorianCalendar.YEAR)));
        System.out.println(input.get((GregorianCalendar.MONTH)));
        System.out.println(input.get((GregorianCalendar.DAY_OF_MONTH)));

        GregorianCalendar input1 = new GregorianCalendar();
        input1.setTimeInMillis(1234567898765L);
        System.out.println(input1.get((GregorianCalendar.YEAR)));
        System.out.println(input1.get((GregorianCalendar.MONTH)));
        System.out.println(input1.get((GregorianCalendar.DAY_OF_MONTH)));
    }
}

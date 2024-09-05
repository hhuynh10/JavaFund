package Test;

public class Main {
    public static void main(String[] args) {
        Automobile mobile = new Automobile('C', 15);

        mobile.setGear('H');
        System.out.println(mobile.getGear());

        mobile.increaseVolume();
        System.out.println(mobile.getVolume());

        mobile.decreaseVolume();
        System.out.println(mobile.getVolume());

        mobile.setPower();
        System.out.println(mobile.getPower());
    }
}

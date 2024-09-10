package Chapter9.Problem8;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void print(){
        if (on) System.out.println("Speed: " + speed + " Color: " + color + " Radius: " + radius);
        else System.out.println("Color: " + color + " Radius: " + radius + " Fan is off");
    }
}

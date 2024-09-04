public class MyRectangle2D {
    private double height;
    private double width;

    public MyRectangle2D() {
        this.height = 0.0;
        this.width = 0.0;
    }

    public MyRectangle2D(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void printRec() {
        System.out.println("Height: " + height + " Width: " + width);
        System.out.println();
    }
}

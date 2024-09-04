public class MyRectangle2D {
    private double height;
    private double width;

    public MyRectangle2D(){
        height = 0.0;
        width = 0.0;
    }

    public MyRectangle2D(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setwidth(double width){
        this.width = width;
    }

    public void print(){
        System.out.println("Height: " + height + ", " +  "Width: " + width);
    }
}

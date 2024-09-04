package Chapter9.Problem1;

public class Problem1 {
    private int height;
    private int width;

    public Problem1(){
        height = 1;
        width = 1;
    }

    public Problem1(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return height * width;
    }

    public int getPerimeter(){
        return (height+width) * 2;
    }

    
}

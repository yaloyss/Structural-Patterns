package bridge;

public class Oval extends Shape {
    public Oval (Color color)
    {
        super(color);
    }
    public void draw()
    {
        color.applyColor();
        System.out.println("Drawing an oval");
    }
}

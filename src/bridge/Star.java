package bridge;

public class Star extends Shape {
    public Star (Color color)
    {
        super(color);
    }
    public void draw()
    {
        color.applyColor();
        System.out.println("Drawing a star");
    }
}

package flyweight;

public class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing a" + color + " circle with coordinates (" + x + ", " + y + ")");
    }
}

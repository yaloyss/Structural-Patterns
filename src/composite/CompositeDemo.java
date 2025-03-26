package composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        Group group = new Group();
        group.add(circle);
        group.add(rectangle);

        group.draw();
    }
}

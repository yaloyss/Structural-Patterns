package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        GraphicElement diamond  = new Diamond();
        GraphicElement decoratedCircle = new BorderGraphicDecorator(diamond);

        System.out.println("Ordinary shape: ");
        diamond.draw();

        System.out.println("\nDecorated shape with border: ");
        decoratedCircle.draw();
    }
}

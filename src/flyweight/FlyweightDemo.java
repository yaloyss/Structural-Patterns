package flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        Shape pinkCircle1 = ShapeFactory.getCircle("pink");
        pinkCircle1.draw(10, 20);

        Shape pinkCircle2 = ShapeFactory.getCircle("pink");
        pinkCircle2.draw(30, 40);
        //використовуємо той самий об'єкт для червоних кіл, але з різними координатами.

        Shape blackCircle = ShapeFactory.getCircle("black");
        blackCircle.draw(50, 60);
    }
}

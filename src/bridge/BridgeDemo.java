package bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Shape oliveStar = new Star(new OliveColor());
        Shape pinkOval = new Oval(new PinkColor());
        oliveStar.draw();
        pinkOval.draw();
    }
}

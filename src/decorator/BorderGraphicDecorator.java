package decorator;

public class BorderGraphicDecorator extends GraphicDecorator {
    public BorderGraphicDecorator(GraphicElement decoratedGraphic) {
        super(decoratedGraphic);
    }

    public void draw() {
        decoratedGraphic.draw();
        System.out.println("Adding border");
    }
}

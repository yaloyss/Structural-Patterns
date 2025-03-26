package decorator;

public abstract class GraphicDecorator implements GraphicElement {
    protected GraphicElement decoratedGraphic;

    public GraphicDecorator(GraphicElement decoratedGraphic) {
        this.decoratedGraphic = decoratedGraphic;
    }

    public void draw() {
        decoratedGraphic.draw();
    }
}

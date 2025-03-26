package composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements GraphicElement {
    private List<GraphicElement> elements = new ArrayList<>();

    public void add(GraphicElement element) {
        elements.add(element);
    }

    public void draw() {
        System.out.println("Drawing the group:");
        for (GraphicElement graphicElement : elements) {
            graphicElement.draw();
        }
    }
}

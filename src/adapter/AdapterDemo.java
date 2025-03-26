package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        // Експорт у PNG
        ImageExporter pngExporter = new PNGExporter();
        pngExporter.exportImage("image.png");

        System.out.println();

        // Експорт у SVG через адаптер
        ImageExporter svgExporter = new SVGAdapter(new SVGExporter());
        svgExporter.exportImage("vector.svg");
    }
}

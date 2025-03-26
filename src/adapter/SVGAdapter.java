package adapter;

public class SVGAdapter implements ImageExporter {
    private SVGExporter svgExporter;

    public SVGAdapter(SVGExporter svgExporter) {
        this.svgExporter = svgExporter;
    }

    @Override
    public void exportImage(String filename) {
        System.out.println("Adapting export PNG -> SVG...");
        svgExporter.saveAsSVG(filename);
    }
}

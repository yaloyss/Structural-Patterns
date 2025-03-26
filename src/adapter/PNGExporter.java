package adapter;

public class PNGExporter implements ImageExporter {
    @Override
    public void exportImage(String filename)
    {
        System.out.println("Exporting image as PNG: " + filename);
    }
}

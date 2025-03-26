package facade;

public class ImageProcessor {
    private ImageLoader svgImage;
    private ImageLoader pngImage;

    public ImageProcessor() {
        svgImage = new SVGImage();
        pngImage = new PNGImage();
    }

    public void loadSVG() {
        svgImage.loadImage();
    }

    public void loadPNG() {
        pngImage.loadImage();
    }
}

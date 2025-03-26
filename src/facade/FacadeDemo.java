package facade;

public class FacadeDemo {
    public static void main(String[] args)
    {
        ImageProcessor processor = new ImageProcessor();

        processor.loadSVG();
        processor.loadPNG();
    }
}

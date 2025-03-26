package proxy;

public class RealImage implements Image {
    private String imageName;
    private boolean isLoaded;

    public RealImage(String imageName) {
        this.imageName = imageName;
        this.isLoaded = false;
    }

    private void loadImage()
    {
        if(!isLoaded) {
            System.out.println("Loading image " + imageName);
            isLoaded = true;
        }
    }
@Override
    public void display() {
        loadImage();
        System.out.println("Displaying image " + imageName);
    }
}

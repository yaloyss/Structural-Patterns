package proxy;

public class RealImage implements Image {
    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading imageName " + imageName);
    }

    public void display() {
        System.out.println("Displaying imageName " + imageName);
    }
}

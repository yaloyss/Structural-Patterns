package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");

        image.display(); //перше звернення завантажує
        System.out.println();
        image.display(); //друге звернення не буде завантажувати, а одразу покаже
    }
}

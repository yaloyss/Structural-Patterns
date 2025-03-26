package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("photo.jpg");

        //перше звернення завантажує зображення
        image.display();
        System.out.println();
        //друге звернення не буде завантажувати, а одразу покаже
        image.display();
        //відкладене завантаження
    }
}

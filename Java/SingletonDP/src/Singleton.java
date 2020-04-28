public class Singleton {

    static Singleton shared = new Singleton();

    private Singleton() {

    }

    static void printMessage() {
        System.out.println("Hello");
    }

}

public class AbstractFactoryDP {
    public static void main(String... args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
        // Adding commenting comment!
        Shape shape = abstractFactory.getShape("Rectangle");
        shape.draw();
    }
}

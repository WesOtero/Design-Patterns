public class AbstractFactoryDP {
    public static void main(String... args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
        Shape shape = abstractFactory.getShape("Square");
        shape.draw();
    }
}

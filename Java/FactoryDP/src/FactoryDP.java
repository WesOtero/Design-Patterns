import sun.awt.windows.WPrinterJob;

public class FactoryDP {
    public static void main(String... args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}

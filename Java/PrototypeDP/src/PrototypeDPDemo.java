
public class PrototypeDPDemo {
    public static void main(String... args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println(clonedShape.getId() + " " + clonedShape.getType());
    }
}

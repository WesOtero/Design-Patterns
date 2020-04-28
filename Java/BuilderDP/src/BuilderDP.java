public class BuilderDP {
    public static void main(String... args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegeMeal();
        meal.showItems();
        System.out.println(meal.getCost());
    }
}

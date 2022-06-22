public class Test {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Margarita", 30);
        System.out.println(pizza);
        Pizza newPizza = (Pizza) pizza.copy();
        System.out.println(newPizza);
    }
}
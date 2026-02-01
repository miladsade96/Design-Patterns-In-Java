package design_patterns.creational.builder_pattern;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder("Thin Crust", "Tomato Sauce")
                .topping("Olives")
                .cheese(true)
                .pepperoni(true)
                .mushrooms(false)
                .build();

        System.out.println(pizza);
    }
}

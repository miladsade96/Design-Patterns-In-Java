package design_patterns.creational.builder_pattern;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pizza {

    private String dough;
    private String sauce;
    private String topping;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    // Private constructor
    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }

    // Builder class
    public static class PizzaBuilder {
        // Required parameters
        private String dough;
        private String sauce;

        // Optional parameters - initialized to default values
        private String topping = "";
        private boolean cheese = true;
        private boolean pepperoni = false;
        private boolean mushrooms = false;

        public PizzaBuilder(String dough, String sauce) {
            this.dough = dough;
            this.sauce = sauce;
        }

        public PizzaBuilder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public PizzaBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder mushrooms(boolean mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

package design_patterns.creational.factory_method_pattern;

import design_patterns.creational.factory_method_pattern.matcha.Controller;

import java.util.Map;

public class ProductsController extends Controller {
    public void listProducts() {
        render("products.html", Map.of("products", new String[]{"Apple", "Banana", "Orange"}));
    }
}

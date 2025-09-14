package design_patterns.creational.factory_method_pattern;

import java.util.Map;

public class MatchaViewEngine {
    public String render(String viewName, Map<String, Object> context) {
        return "View rendered by Matcha!";
    }
}

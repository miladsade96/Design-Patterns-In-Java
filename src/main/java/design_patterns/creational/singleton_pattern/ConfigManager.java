package design_patterns.creational.singleton_pattern;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private final Map<String, Object> settings = new HashMap<>();

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }
}

package design_patterns.creational.singleton_pattern;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class ConfigManager {

    @Getter
    private static final ConfigManager instance = new ConfigManager();
    private final Map<String, Object> settings = new HashMap<>();

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }
}

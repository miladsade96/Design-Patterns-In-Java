package design_patterns.creational.singleton_pattern;

public class Main {
    public static void main(String[] args) {
        ConfigManager config = new ConfigManager();
        config.set("app_name", "MyApplication");
        System.out.println("App Name: " + config.get("app_name"));

        ConfigManager anotherConfig = new ConfigManager();
        System.out.println("App Name from another instance: " + anotherConfig.get("app_name")); // This will print null since it's a different instance
    }
}

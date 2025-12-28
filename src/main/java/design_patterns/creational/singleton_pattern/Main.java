package design_patterns.creational.singleton_pattern;

public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();
        config.set("app_name", "MyApplication");
        System.out.println("App Name: " + config.get("app_name"));

        ConfigManager anotherConfig = ConfigManager.getInstance();
        System.out.println("App Name from another reference: " + anotherConfig.get("app_name"));


        // Eager Initialization:
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("eagerSingleton1: " + eagerSingleton1.hashCode());
        System.out.println("eagerSingleton2: " + eagerSingleton2.hashCode());
    }
}

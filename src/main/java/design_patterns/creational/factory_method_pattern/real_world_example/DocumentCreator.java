package design_patterns.creational.factory_method_pattern.real_world_example;

public abstract class DocumentCreator {

    public abstract Document createDocument();

    public void openDocument() {
        Document document = createDocument();
        document.open();
        document.save();
        document.print();
        document.close();
    }
}

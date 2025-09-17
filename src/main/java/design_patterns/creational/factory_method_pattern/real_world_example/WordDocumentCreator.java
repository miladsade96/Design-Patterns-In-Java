package design_patterns.creational.factory_method_pattern.real_world_example;

public class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

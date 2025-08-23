package design_patterns.behavioral.strategy_pattern;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store("a.jpeg", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("b.png", new PngCompressor(), new HighContrastFilter());
    }
}

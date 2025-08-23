package design_patterns.behavioral.strategy_pattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ImageStorage {
    private String compressor;
    private String filter;

    private void store(String fileName) {
        if (compressor.equals("jpeg")) System.out.println("Compressing using jpeg");
        else if (compressor.equals("png")) System.out.println("Compressing using png");

        if (filter.equals("b&w")) System.out.println("Applying b&w filter");
        if (filter.equals("high-contrast")) System.out.println("Applying high-contrast filter");
    }
}

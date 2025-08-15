package design_patterns.behavioral.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private final List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }
}

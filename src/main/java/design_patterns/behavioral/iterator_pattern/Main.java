package design_patterns.behavioral.iterator_pattern;

public class Main {
    public static void main(String[] args) {
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        for (int i = 0; i < browseHistory.getUrls().size(); i++) {
            System.out.println(browseHistory.getUrls().get(i));
        }
    }
}

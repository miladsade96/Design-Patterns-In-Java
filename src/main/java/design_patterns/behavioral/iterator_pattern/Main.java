package design_patterns.behavioral.iterator_pattern;

public class Main {
    public static void main(String[] args) {
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");

        Iterator<String> iterator = browseHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}

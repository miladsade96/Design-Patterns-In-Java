package design_patterns.behavioral.visitor_pattern;

public class Main {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        document.addNode(new HeadingNode());
        document.addNode(new AnchorNode());
        document.highlight();
    }
}

package design_patterns.behavioral.visitor_pattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private final List<HtmlNode> nodes = new ArrayList<>();

    public void addNode(HtmlNode node) {
        nodes.add(node);
    }

    public void highlight() {
        for (HtmlNode node : nodes) {
            node.highlight();
        }
    }
}

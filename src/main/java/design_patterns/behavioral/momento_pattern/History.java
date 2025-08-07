package design_patterns.behavioral.momento_pattern;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        if (states.isEmpty()) {
            return null;
        }
        return states.removeLast();
    }
}

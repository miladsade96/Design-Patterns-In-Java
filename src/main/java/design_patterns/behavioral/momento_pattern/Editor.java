package design_patterns.behavioral.momento_pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Editor {
    private String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        try {
            this.content = state.content();
        } catch (NullPointerException e) {
            this.content = "";
        }
    }
}

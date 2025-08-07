package design_patterns.behavioral.momento_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EditorState {
    private final String content;
}

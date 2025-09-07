package design_patterns.behavioral.chain_of_responsibility_pattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Handler {
    private Handler next;

    public void handle(HttpRequest request) {
        if (doHandle(request)) {
            return;
        }
        if (next != null) {
            next.handle(request);
        }
    }

    protected abstract boolean doHandle(HttpRequest request);
}
